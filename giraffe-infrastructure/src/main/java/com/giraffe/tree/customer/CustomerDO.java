package com.giraffe.tree.customer;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "customer")
public class CustomerDO{
  private String customerId;
  private String memberId;
  private String globalId;
  private long registeredCapital;
  private String companyName;
}
