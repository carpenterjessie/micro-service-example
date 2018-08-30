package com.example.order.orderservicecontract.contract;

import com.example.order.orderservicecontract.dto.request.PlaceOrderRequest;
import com.example.order.orderservicecontract.dto.response.OrderDetail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient("order-service")
public interface PlaceOrderService {
    @PostMapping(value = "/tcc/order/place")
    ResponseEntity<OrderDetail> tryPlaceOrder(@RequestBody PlaceOrderRequest request,
            @RequestHeader(value = "transactionId") String transactionId);

}
