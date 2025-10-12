package com.biswa.java8;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product(1,"TV");
        System.out.println(product.productId()+" "+product.productName());
    }
}
