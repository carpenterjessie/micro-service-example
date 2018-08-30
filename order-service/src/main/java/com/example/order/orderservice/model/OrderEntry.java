package com.example.order.orderservice.model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Data
@Embeddable
public class OrderEntry{
    private String productId;

    private Long quantity;

    private BigDecimal totalPrice;
}
