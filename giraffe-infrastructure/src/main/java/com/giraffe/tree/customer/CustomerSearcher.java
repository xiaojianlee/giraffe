package com.giraffe.tree.customer;

import cn.zhxu.bs.BeanSearcher;
import cn.zhxu.bs.SearchResult;
import com.alibaba.cola.dto.Response;
import com.alibaba.cola.dto.SingleResponse;
import com.alibaba.fastjson.JSON;
import com.giraffe.tree.dto.data.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/***
 * @description
 * @author lixiaojian-jk
 * @create 2023/7/31
 **/
@Service
public class CustomerSearcher {
    @Autowired
    private BeanSearcher beanSearcher;

    public SearchResult listCustomerByName(String name){
        HashMap<String,Object> param = new HashMap<String,Object>();
        param.put("companyName",name);
        SearchResult<CustomerSBean> search = beanSearcher.search(CustomerSBean.class, param);
        System.out.println("listCustomerByName:"+ JSON.toJSONString(search));
        return search;
    }
}
