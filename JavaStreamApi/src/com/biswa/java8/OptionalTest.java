package com.biswa.java8;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        String s = null;

        Optional<String> s1 = Optional.ofNullable(s);
        System.out.println(s1.isPresent()?s1.get():"NA");
    }
}
