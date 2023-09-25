package org.example.stream;

import java.util.Objects;

public class Product {
    private String productType;
    private double price;
    private String productName;


    public Product(String productType, double price, String productName) {
        this.productType = productType;
        this.price = price;
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    @Override
    public String toString() {
        return "Тип товара: " + productType
                + ", Цена: " + price
                + ", Название товара: " + productName;
    }
}
