package com.biswa.java8;

import java.util.Arrays;
import java.util.stream.Stream;

public class SumOfSquareEvenNumbers {
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,7,10};
        int sum = Arrays.stream(values)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sum();
        System.out.println(sum);

    }
}
