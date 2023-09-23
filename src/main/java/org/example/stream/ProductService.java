package org.example.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    public static List<Product> findProductByPriceMoreAndProductType(List<Product> products, int price, String productType) {
        return products.stream()
                .filter(product -> product.getProductType().equals(productType))
                .filter(product -> product.getPrice() > price)
                .collect(Collectors.toList());
    }

    public static void applyDiscount(List<Product> products, int discount, String productType) {
        products.stream()
                .filter(product -> product.getProductType().equals(productType))
                .forEach(product -> product.setPrice(product.getPrice() - (product.getPrice() * 1 / discount)));
    }

    public static List<Product> alphabetOrderByProductName(List<Product> products, String productType) {
        return products.stream()
                .filter(product -> product.getProductType().equals(productType))
                .sorted(Comparator.comparing(Product::getProductName))
                .collect(Collectors.toList());
    }
}
