//package com.cloudshare.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cloudshare.dto.PaymentDTO;
//import com.cloudshare.dto.PaymentVerificationDTO;
//import com.cloudshare.service.PaymentService;
//
//@RestController
//@RequestMapping("/payments")
//public class PaymentController {
//
//	@Autowired
//    private PaymentService paymentService;
//
//    @PostMapping("/create-order")
//    public ResponseEntity<?> createOrder(@RequestBody PaymentDTO paymentDTO) {
//        PaymentDTO response = paymentService.createOrder(paymentDTO);
//
//        if (response.getSuccess()) {
//            return ResponseEntity.ok(response);
//        } else {
//            return ResponseEntity.badRequest().body(response);
//        }
//    }
//
//    @PostMapping("/verify-payment")
//    public ResponseEntity<?> verifyPayment(@RequestBody PaymentVerificationDTO request) {
//       PaymentDTO response = paymentService.verifyPayment(request);
//        if (response.getSuccess()) {
//            return ResponseEntity.ok(response);
//        } else {
//            return ResponseEntity.badRequest().body(response);
//        }
//    }
//    
//}
