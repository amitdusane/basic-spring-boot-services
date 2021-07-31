package com.amitd.os.model;

import com.amitd.os.common.Payment;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrderResponse {

  private Order order;
  private Payment payment;
}
