package com.fnb.rofa.co.za.controller;

import com.fnb.rofa.co.za.dto.PaymentDTO;
import com.fnb.rofa.co.za.model.Payment;
import com.fnb.rofa.co.za.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/fnb/")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("payment/save")
    public Payment makePayment(@RequestBody PaymentDTO paymentDTO) {
        return paymentService.makePayment(paymentDTO);
    }

    @PostMapping("payment/account/settlement")
    public Payment settleAccount(@RequestBody PaymentDTO paymentDTO) {
        return paymentService.makePayment(paymentDTO);
    }

    @GetMapping("payment/find/{userId}")
    public Payment findByUserId(@PathVariable String userId) {
        return paymentService.findByUserId(userId);
    }
}
