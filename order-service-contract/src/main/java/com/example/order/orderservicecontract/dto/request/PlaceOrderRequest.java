package com.example.order.orderservicecontract.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class PlaceOrderRequest {

    private String customerName;

    private List<Item> items;

    @Data
    @NoArgsConstructor
    public static class Item{
        private String productId;

        private Long quantity;
    }

}
