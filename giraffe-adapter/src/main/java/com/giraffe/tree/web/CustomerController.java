package com.giraffe.tree.web;

import cn.zhxu.bs.SearchResult;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.giraffe.tree.api.CustomerServiceI;
import com.giraffe.tree.dto.CustomerAddCmd;
import com.giraffe.tree.dto.CustomerListByNameQry;
import com.giraffe.tree.dto.data.CustomerDTO;
import com.giraffe.tree.customer.CustomerSearcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @Autowired
    private CustomerServiceI customerService;
    @Autowired
    private CustomerSearcher customerSearcher;

    @GetMapping(value = "/helloworld")
    public String helloWorld(){
        return "Hello, welcome to COLA world!";
    }

    @GetMapping(value = "/customer")
    public MultiResponse<CustomerDTO> listCustomerByName(@RequestParam(required = false) String name){
        CustomerListByNameQry customerListByNameQry = new CustomerListByNameQry();
        customerListByNameQry.setName(name);
        return customerService.listByName(customerListByNameQry);
    }

    @PostMapping(value = "/customer")
    public Response addCustomer(@RequestBody CustomerAddCmd customerAddCmd){
        return customerService.addCustomer(customerAddCmd);
    }

    @PostMapping(value = "/search")
    public Response search(@RequestParam(required = false) String name){
        SearchResult searchResult = customerSearcher.listCustomerByName(name);
        return SingleResponse.of(searchResult);
    }
}
