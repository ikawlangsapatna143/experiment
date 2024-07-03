package com.pioneers.co.experiment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private long id;
    private long orderId;
    private long productId;
    private Integer quantity;
    private Double price;

    OrderItem(){
    }

    public OrderItem(long orderId, long productId, Integer quantity, Double price) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public long getOrderId() {
        return orderId;
    }

    public long getProductId() {
        return productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }
    

}
