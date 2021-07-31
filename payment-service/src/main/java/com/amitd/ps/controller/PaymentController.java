package com.amitd.ps.controller;

import com.amitd.ps.model.Payment;
import com.amitd.ps.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

  @Autowired
  private PaymentService paymentService;

  @GetMapping
  public String getService() {
    return "This is a Payment Service";
  }

  @PostMapping
  public Payment createTransaction(@RequestBody Payment payment) {
    return paymentService.savePayment(payment);
  }

}
