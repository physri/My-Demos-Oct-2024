package com.in28minutes.springboot.basics.springbootin10steps.java8demos;

import java.util.List;
public class Order {
    private List<Product> productList;
    private Long orderId;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
