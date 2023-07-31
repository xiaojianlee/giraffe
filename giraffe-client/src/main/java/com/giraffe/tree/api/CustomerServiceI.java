package com.giraffe.tree.api;

import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.giraffe.tree.dto.CustomerAddCmd;
import com.giraffe.tree.dto.CustomerListByNameQry;
import com.giraffe.tree.dto.data.CustomerDTO;

public interface CustomerServiceI {

    Response addCustomer(CustomerAddCmd customerAddCmd);

    MultiResponse<CustomerDTO> listByName(CustomerListByNameQry customerListByNameQry);
}
