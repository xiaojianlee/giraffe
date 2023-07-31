package com.giraffe.tree.test;

import com.alibaba.fastjson.JSON;
import com.giraffe.tree.domain.customer.Customer;
import com.giraffe.tree.domain.customer.gateway.CustomerGateway;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/***
 * @description
 * @author lixiaojian-jk
 * @create 2023/7/31
 **/
@SpringBootTest
public class CustomerGatewayImplTest {

    @Autowired
    CustomerGateway customerGateway;

    @Test
    public void getByById() {
        Customer abc = customerGateway.getByById("abc");
        System.out.println(JSON.toJSONString(abc));
    }

    @Test
    public void testGetById() {
        Customer testname = customerGateway.getByCompanyName("testname");
        System.out.println(JSON.toJSONString(testname));

    }
}