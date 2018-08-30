package com.example.order.orderservice.facade;

import com.example.order.orderservice.component.OrderMapper;
import com.example.order.orderservice.model.OrderEntry;
import com.example.order.orderservice.service.OrderService;
import com.example.order.orderservicecontract.dto.request.PlaceOrderRequest;
import com.example.order.orderservicecontract.dto.response.OrderDetail;
import com.example.order.orderservice.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.stream.Collectors;

@Service
public class OrderFacade {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderMapper orderMapper;

    public OrderDetail tryPlaceOrder(PlaceOrderRequest placeOrderRequest,String transactionId){
        Order order = new Order();
        order.setCustomerName(placeOrderRequest.getCustomerName());
        order.setEntries(placeOrderRequest.getItems().stream().map(item -> {
            OrderEntry orderEntry = new OrderEntry();
            orderEntry.setProductId(item.getProductId());
            orderEntry.setQuantity(item.getQuantity());
//            orderEntry.setTotalPrice();
            return orderEntry;
        }).collect(Collectors.toList()));
        order.setTransactionId(transactionId);
        Order savedOrder = this.orderService.save(order);
        return this.orderMapper.map(savedOrder,OrderDetail.class);
    }
}
