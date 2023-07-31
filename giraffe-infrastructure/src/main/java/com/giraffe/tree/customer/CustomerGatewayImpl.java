package com.giraffe.tree.customer;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.giraffe.tree.domain.customer.Customer;
import com.giraffe.tree.domain.customer.gateway.CustomerGateway;

import com.giraffe.tree.mapper.CustomerMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerGatewayImpl implements CustomerGateway {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public Customer getByById(String customerId){
      CustomerDO customerDO = customerMapper.getById(customerId);
      //Convert to Customer
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDO,customer);
      return customer;
    }

    @Override
    public Customer getByCompanyName(String companyName){

        QueryWrapper<CustomerDO> query = new QueryWrapper<CustomerDO>();
        query.lambda().eq(CustomerDO::getCompanyName, companyName);
        CustomerDO customerDO = customerMapper.selectOne(query);
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDO,customer);
        return customer;
    }

}
