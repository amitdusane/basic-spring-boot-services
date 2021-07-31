package com.amitd.ps.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Payment_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

  @Id
  @GeneratedValue
  private long paymentId;
  private double transactionAmount;
  private String transactionId;
  private long orderId;
}
