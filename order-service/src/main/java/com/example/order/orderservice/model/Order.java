package com.example.order.orderservice.model;

import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Generated;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "order_header")
public class Order {

    @Id
    @Column
    @GeneratedValue
    private String orderId = UUID.randomUUID().toString();

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date placeAt = new Date();

    @CollectionTable(joinColumns = @JoinColumn(name = "order_id"))
    @ElementCollection
    @Fetch(FetchMode.JOIN)
    private List<OrderEntry> entries;

    @Column
    private String customerName;

    @Column
    private String           transactionId;
}
