package com.amitd.os.model;

import org.hibernate.annotations.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Order_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

  @Id
  @GeneratedValue
  private long orderId;
  private String item;
  private double amount;

}
