package com.giraffe.tree.domain.customer.gateway;

import com.giraffe.tree.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
