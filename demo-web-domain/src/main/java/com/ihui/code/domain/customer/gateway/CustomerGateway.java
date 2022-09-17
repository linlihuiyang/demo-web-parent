package com.ihui.code.domain.customer.gateway;

import com.ihui.code.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
