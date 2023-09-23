package org.example.stream;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class OrderService {

    public static List<Order> getOrderNotPaid(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.getPaymentDate() == null)
                .collect(Collectors.toList());
    }

    public static List<Order> getOrderFromDate1AndDate2(List<Order> orders, Date date1, Date date2) {
        return orders.stream()
                .filter(order -> date1.before(order.getRegistrationDate()) && date2.after(order.getRegistrationDate()))
                .collect(Collectors.toList());
    }

    public static List<Order> applyDiscountOrderMore1000(List<Order> orders) {
        return orders.stream()
                .filter(order -> order.orderCost() > 1000)
                .peek(order -> order.getProducts()
                        .forEach(product -> product.setPrice(product.getPrice() - (product.getPrice() * 0.05))))
                .collect(Collectors.toList());

    }
}
