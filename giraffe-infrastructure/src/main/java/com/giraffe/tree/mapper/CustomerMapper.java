package com.giraffe.tree.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.giraffe.tree.customer.CustomerDO;
import com.giraffe.tree.domain.customer.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface CustomerMapper extends BaseMapper<CustomerDO> {

  CustomerDO getById(String customerId);
}
