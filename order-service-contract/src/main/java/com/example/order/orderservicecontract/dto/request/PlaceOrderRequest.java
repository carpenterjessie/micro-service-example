package com.example.order.orderservicecontract.dto.request;

import lombok.Data;

@Data
public class PlaceOrderRequest {

    private String productId;

    private Long quantity;
}
