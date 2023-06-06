package com.fnb.rofa.co.za.repository;

import com.fnb.rofa.co.za.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {
    Payment findByUserId(String userId);
}
