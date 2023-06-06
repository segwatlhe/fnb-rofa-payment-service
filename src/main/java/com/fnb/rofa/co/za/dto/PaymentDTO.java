package com.fnb.rofa.co.za.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.List;

@ToString
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String account;
    private String contactNumber;
    private String email;
    private String fullName;
    private String idNumber;
    private LocalDateTime invoiceDate;
    private String items;
    private String invoiceId;
    private String orderId;
    private String userId;
    private String paymentMethods;
    private LocalDateTime date;
    //private List<PaymentMethodDTO> paymentMethods;

}
