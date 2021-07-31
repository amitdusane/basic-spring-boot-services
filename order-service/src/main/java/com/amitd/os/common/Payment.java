package com.amitd.os.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

  private long paymentId;
  private double transactionAmount;
  private String transactionId;
  private long orderId;
}
