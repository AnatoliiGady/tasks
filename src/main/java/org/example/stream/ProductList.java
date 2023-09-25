package org.example.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductList {

    List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> findProductByPriceMoreAndProductType(int price, String productType) {
        return products.stream()
                .filter(product -> product.getProductType().equals(productType))
                .filter(product -> product.getPrice() > price)
                .collect(Collectors.toList());
    }

    public void applyDiscount(int discount, String productType) {
        products.stream().filter(product -> product.getProductType().equals(productType))
                .peek(product -> product.setPrice(product.getPrice() - (product.getPrice() * 1 / discount)))
                .forEach(System.out::println);
    }

    public void alphabetOrderByProductName(String productType) {
        products.stream().filter(product -> product.getProductType().equals(productType))
                .sorted(Comparator.comparing(Product::getProductName)).forEach(System.out::println);
    }



}
