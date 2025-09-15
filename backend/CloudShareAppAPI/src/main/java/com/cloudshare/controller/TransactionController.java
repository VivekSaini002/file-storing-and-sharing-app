package com.cloudshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudshare.document.PaymentTransaction;
import com.cloudshare.document.ProfileDocument;
import com.cloudshare.repository.PaymentTransactionRepository;
import com.cloudshare.service.ProfileService;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

	@Autowired
    private PaymentTransactionRepository paymentTransactionRepository;
	@Autowired
    private ProfileService profileService;

    @GetMapping
    public ResponseEntity<?> getUserTransactions() {
        ProfileDocument currentProfile = profileService.getCurrentProfile();
        String clerkId = currentProfile.getClerkId();

        List<PaymentTransaction> transactions = paymentTransactionRepository.findByClerkIdAndStatusOrderByTransactionDateDesc(clerkId, "SUCCESS");
        return ResponseEntity.ok(transactions);
    }
}
