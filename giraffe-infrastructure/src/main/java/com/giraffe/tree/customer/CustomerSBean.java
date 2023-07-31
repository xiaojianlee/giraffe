package com.giraffe.tree.customer;

import cn.zhxu.bs.bean.SearchBean;
import lombok.Data;

/***
 * @description
 * @author lixiaojian-jk
 * @create 2023/7/31
 **/
@SearchBean(tables = "customer")
@Data
public class CustomerSBean {

    private String customerId;
    private Integer globalId;
    private String companyName;
}
