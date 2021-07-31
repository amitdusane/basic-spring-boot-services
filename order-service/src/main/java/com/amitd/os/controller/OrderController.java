package com.amitd.os.controller;

import com.amitd.os.common.Payment;
import com.amitd.os.model.Order;
import com.amitd.os.model.OrderResponse;
import com.amitd.os.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {

  @Autowired
  private OrderService orderService;

  @Autowired
  private RestTemplate restTemplate;

  @PostMapping
  public OrderResponse placeOrder(@RequestBody Order order) {

    final Order savedOrder = orderService.save(order);

    Payment payment = new Payment();
    payment.setOrderId(savedOrder.getOrderId());
    payment.setTransactionAmount(savedOrder.getAmount());

    Payment savedPayment = restTemplate.postForObject("http://localhost:1992/payment", payment, Payment.class);

    OrderResponse orderResponse = new OrderResponse(savedOrder, savedPayment);
    return orderResponse;

  }

  @GetMapping
  public String getOrder() {
    return "This is a Order Service";
  }
}
