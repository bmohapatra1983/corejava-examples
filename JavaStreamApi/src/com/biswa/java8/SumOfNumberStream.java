package com.biswa.java8;

import java.util.Arrays;

public class SumOfNumberStream {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        Integer reduce = Arrays.stream(num)
                .boxed()
                .reduce(0, Integer::sum);
        System.out.println(reduce);

        int n = 12345;
        int sum = String.valueOf(n).chars()
                .map(c -> c - '0').sum();
        System.out.println(sum);
    }
}
