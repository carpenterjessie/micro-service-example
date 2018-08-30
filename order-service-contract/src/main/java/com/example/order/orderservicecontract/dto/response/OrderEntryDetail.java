package com.example.order.orderservicecontract.dto.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrderEntryDetail {
    private String productId;

    private Long quantity;

    private BigDecimal totalPrice;
}
