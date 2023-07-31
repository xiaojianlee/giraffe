package com.giraffe.tree.domain.customer.gateway;

import com.giraffe.tree.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);

    Customer getByCompanyName(String companyName);
}
