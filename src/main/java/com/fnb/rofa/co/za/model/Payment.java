package com.fnb.rofa.co.za.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@ToString
@Getter
@Setter
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String account;
    private LocalDateTime date;
    private String contactNumber;
    private String email;
    private String fullName;
    private String idNumber;
    private LocalDateTime invoiceDate;
    private String items;
    private String invoiceId;
    @Column(unique=true)
    private String orderId;
    private String userId;
    private String paymentMethods;

}