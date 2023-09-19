package org.example.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProductList {

    List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void findProductByPriceMoreAndProductType(int price, String productType) {
        products.stream().filter(product -> product.getProductType().equals(productType))
                .filter(product -> product.getPrice() > price).forEach(System.out::println);
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
