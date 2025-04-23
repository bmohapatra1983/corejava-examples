package com.biswa;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEvenFromList {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,7,8,9,10};
        Map<String, List<Integer>> collect = IntStream.of(arr).boxed()
                .collect(Collectors.groupingBy(n -> n % 2 == 0 ? "even" : "odd"));
        System.out.println(collect);


    }
}
