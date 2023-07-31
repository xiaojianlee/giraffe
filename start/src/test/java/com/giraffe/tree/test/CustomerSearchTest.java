package com.giraffe.tree.test;

import cn.zhxu.bs.BeanSearcher;
import cn.zhxu.bs.SearchResult;
import cn.zhxu.bs.util.MapUtils;
import com.alibaba.fastjson.JSON;
import com.giraffe.tree.customer.CustomerSBean;
import com.giraffe.tree.customer.CustomerSearcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/***
 * @description
 * @author lixiaojian-jk
 * @create 2023/7/31
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerSearchTest {
    @Autowired
    CustomerSearcher customerSearcher;

    @Autowired
    BeanSearcher beanSearcher;

    @Test
    public void listCustomerByName(){
        customerSearcher.listCustomerByName("testname");
    }


    @Test
    public void testCustomerSearch() {
        Map<String, Object> params = MapUtils.builder()
                .field(CustomerSBean::getCustomerId, "abc")                            // 年龄参数为 20
                .page(0, 15)                                        // 第 0 页, 每页 15 条
                .build();
        SearchResult<CustomerSBean> search = beanSearcher.search(CustomerSBean.class, params);
        System.out.println(JSON.toJSONString(search));
    }
}
