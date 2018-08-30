package com.example.order.orderservice.facade;

import com.example.order.orderservicecontract.dto.request.PlaceOrderRequest;
import com.example.order.orderservicecontract.dto.response.OrderDetail;
import com.example.order.orderservice.model.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderFacade {
    public OrderDetail tryPlaceOrder(PlaceOrderRequest placeOrderRequest,String transactionId){
        Order order = new Order();
        return new OrderDetail();
    }
}
