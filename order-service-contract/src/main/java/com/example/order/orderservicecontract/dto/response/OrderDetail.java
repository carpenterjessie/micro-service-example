package com.example.order.orderservicecontract.dto.response;

import lombok.Data;

import java.util.Set;

@Data
public class OrderDetail {
    private String orderId;
    private Set<OrderEntryDetail> entries;
}
