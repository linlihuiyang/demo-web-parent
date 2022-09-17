package com.ihui.code.domain.customer.gateway;

import com.ihui.code.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
