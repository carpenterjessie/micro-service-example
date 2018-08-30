package com.example.customer.customerclient.client;

import com.example.order.orderservicecontract.contract.PlaceOrderService;
import com.example.order.orderservicecontract.dto.request.PlaceOrderRequest;
import com.example.order.orderservicecontract.dto.response.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class CustomerOrderService {

    @Autowired
    private PlaceOrderService placeOrderService;

    public void consum(){
        PlaceOrderRequest placeOrderRequest = new PlaceOrderRequest();
        placeOrderRequest.setCustomerName("test");
        PlaceOrderRequest.Item item1 = new PlaceOrderRequest.Item();
        item1.setProductId("product-1");
        item1.setQuantity(2L);

        String transactionId = UUID.randomUUID().toString();

        OrderDetail orderDetail = this.placeOrderService.tryPlaceOrder(placeOrderRequest,transactionId).getBody();
        System.out.print(orderDetail);
    }

}
