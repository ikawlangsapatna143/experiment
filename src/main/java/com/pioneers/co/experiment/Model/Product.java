package com.pioneers.co.experiment.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {

    private @Id
    @GeneratedValue Long id;
    private String productName;
    private String description;
    private double price;
    
    public Product(){}

    //contructor
    public Product(String productName, String decription, double price) {
        this.productName = productName;
        this.description = decription;
        this.price = price;
    }
 //Setters
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setDecription(String decription) {
        this.description = decription;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//Getters
    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getDecription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    
}
