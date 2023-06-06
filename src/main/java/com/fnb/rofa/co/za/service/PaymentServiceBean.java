package com.fnb.rofa.co.za.service;

import com.fnb.rofa.co.za.dto.PaymentDTO;
import com.fnb.rofa.co.za.model.Payment;
import com.fnb.rofa.co.za.repository.PaymentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PaymentServiceBean implements PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentServiceBean(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment makePayment(PaymentDTO paymentDTO) {
        System.out.println(paymentDTO);
        LocalDateTime date = LocalDateTime.now();
        Payment payment = new Payment();
        payment.setAccount(paymentDTO.getAccount());
        payment.setDate(date);
        payment.setEmail(paymentDTO.getEmail());
        payment.setContactNumber(paymentDTO.getContactNumber());
        payment.setOrderId(paymentDTO.getOrderId());
        payment.setUserId(paymentDTO.getUserId());
        payment.setInvoiceId(paymentDTO.getInvoiceId());
        payment.setPaymentMethods(paymentDTO.getPaymentMethods());
        return paymentRepository.save(payment);
    }

    @Override
    public Payment settleAccount(PaymentDTO paymentDTO) {
        System.out.println("Settle Account");
        return null;
    }

    @Override
    public Payment findByUserId(String userId) {
        return paymentRepository.findByUserId(userId);
    }
}
