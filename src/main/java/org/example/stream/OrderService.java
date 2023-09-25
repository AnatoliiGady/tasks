package org.example.stream;

import java.util.*;
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

    public static List<Map.Entry<String, Long>> topThreeProductsOrders(List<Order> orders) {
        List<Map.Entry<String, Long>> collect = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .collect(Collectors.groupingBy(Product::getProductName, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((current, next) -> next.getValue().compareTo(current.getValue()))
                .limit(3).toList();
        return collect;
    }

    public static double applyDiscountAllOrder(List<Order> orders, int discount) {
        double priceOrderAll = orders.stream()
                .flatMap(order -> order.getProducts().stream())
                .mapToDouble(Product::getPrice)
                .sum();
        return priceOrderAll - (priceOrderAll * ((double) discount / 100));
    }


}
