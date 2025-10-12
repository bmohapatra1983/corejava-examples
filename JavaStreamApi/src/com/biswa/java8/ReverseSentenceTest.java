package com.biswa.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseSentenceTest {
    public static void main(String[] args) {
        String input = "I am preparing for interviews";

        String collect = Arrays.stream(input.split(" "))
                .map(s -> new StringBuffer(s).reverse().toString())
                .collect(Collectors.joining(" "));


        System.out.println(collect);

        List<String> list = Arrays.asList(input.trim().split(" "));
        Collections.reverse(list);

        System.out.println(list);
        String collect1 = list.stream()
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(collect1);
    }
}
