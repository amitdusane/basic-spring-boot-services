package com.amitd.os.service;

import com.amitd.os.model.Order;
import com.amitd.os.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class OrderService {

  @Autowired
  private OrderRepository orderRepository;

  public Order save(Order order) {
    Assert.state(order != null, "Order can not be null");
    return orderRepository.save(order);
  }

}
