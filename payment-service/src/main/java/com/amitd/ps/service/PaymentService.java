package com.amitd.ps.service;

import com.amitd.ps.model.Payment;
import com.amitd.ps.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import java.util.UUID;

@Service
public class PaymentService {

  @Autowired
  private PaymentRepository paymentRepository;

  public Payment savePayment(Payment payment) {
    Assert.state(payment != null, "Payment can not be null");
    payment.setTransactionId(UUID.randomUUID().toString());
    return paymentRepository.save(payment);
  }
}
