package com.example.order.orderservice.web;


import com.example.order.orderservice.facade.OrderFacade;
import com.example.order.orderservicecontract.contract.PlaceOrderService;
import com.example.order.orderservicecontract.dto.request.PlaceOrderRequest;
import com.example.order.orderservicecontract.dto.response.OrderDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class OrderController implements PlaceOrderService{

    @Autowired
    private OrderFacade orderFacade;

    @Override
    public ResponseEntity<OrderDetail> tryPlaceOrder(PlaceOrderRequest request, String transactionId) {
        return ResponseEntity.ok(this.orderFacade.tryPlaceOrder(request,transactionId));
    }
}
