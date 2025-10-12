package com.biswa.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EvenFromArray {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.range(1, 50)
                //.boxed()
                .filter(n -> n % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
