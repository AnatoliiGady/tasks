package org.example.stream;

import java.util.*;
import java.util.stream.Collectors;

public class OrderMain {
    public static void main(String[] args) {

        Order order1 = new Order(new Date(123, Calendar.APRIL, 5), 1);
        order1.add(new Product("продукты", 100, "Яйца"));
        order1.add(new Product("продукты", 59, "Хлеб"));
        order1.add(new Product("продукты", 300, "Яйца"));
        order1.add(new Product("игрушки", 100, "Робот"));
        order1.add(new Product("игрушки", 100, "Пылесос"));
        order1.add(new Product("игрушки", 100, "Солдатик"));

        Order order2 = new Order(new Date(123, Calendar.AUGUST, 10), 2);
        order2.add(new Product("игрушки", 506, "Машинка"));
        order2.add(new Product("игрушки", 5000, "Лего"));
        order2.add(new Product("продукты", 150, "Мокороны"));
        order2.add(new Product("продукты", 450, "Яйца"));
        order2.add(new Product("продукты", 1200, "Красная икра"));
        order2.add(new Product("продукты", 1200, "Солдатик"));

        List<Order> orders = new ArrayList<>();
        orders.add(order1);
        orders.add(order2);
        order1.setPaymentDate(new Date(123, Calendar.SEPTEMBER, 22));
        System.out.println(OrderService.getOrderNotPaid(orders));
        System.out.println("--------------------------------------");
        System.out.println(OrderService.getOrderFromDate1AndDate2(orders, new Date(123, Calendar.JANUARY, 1), new Date(123, Calendar.SEPTEMBER, 30)));
        System.out.println("--------------------------------------");
        System.out.println(OrderService.applyDiscountOrderMore1000(orders));
        System.out.println("--------------------------------------");
        System.out.println(OrderService.topThreeProductsOrders(orders));
        System.out.println("--------------------------------------");
        System.out.println(OrderService.applyDiscountAllOrder(orders, 10));
    }

}
