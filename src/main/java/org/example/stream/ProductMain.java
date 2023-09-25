package org.example.stream;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("продукты", 100, "Молоко"));
        products.add(new Product("продукты", 59, "Хлеб"));
        products.add(new Product("продукты", 300, "Яйца"));
        products.add(new Product("игрушки", 1000, "Робот"));
        products.add(new Product("игрушки", 506, "Машинка"));
        products.add(new Product("игрушки", 23, "Значек"));
        products.add(new Product("игрушки", 5000, "Лего"));
        products.add(new Product("продукты", 150, "Мокороны"));
        products.add(new Product("продукты", 450, "Колбаса"));
        products.add(new Product("продукты", 1200, "Красная икра"));

        System.out.println(ProductService.findProductByPriceMoreAndProductType(products, 500, "игрушки"));
        System.out.println(ProductService.alphabetOrderByProductName(products, "игрушки"));

    }
}
