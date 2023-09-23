package org.example.stream;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private final Date  registrationDate;
    private final int number;
    private Date paymentDate;

    private final List<Product> products = new ArrayList<>();

    public Order(Date registrationDate, int number) {
        this.registrationDate = registrationDate;
        this.number = number;

    }

    public void add(Product product) {
        products.add(product);
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public int getNumber() {
        return number;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return "Order{"
                + "orderRegistrationDate=" + registrationDate
                + ", orderNumber=" + number
                + ", orderPaymentDate=" + paymentDate
                + ", order=" + products
                + '}';
    }
}
