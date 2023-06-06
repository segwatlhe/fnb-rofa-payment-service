package com.fnb.rofa.co.za.service;

import com.fnb.rofa.co.za.dto.PaymentDTO;
import com.fnb.rofa.co.za.model.Payment;

public interface PaymentService {

    Payment makePayment(PaymentDTO payment);
    Payment settleAccount(PaymentDTO payment);
    Payment findByUserId(String userId);

}
