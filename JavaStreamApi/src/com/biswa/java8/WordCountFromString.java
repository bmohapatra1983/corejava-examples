package com.biswa.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Duplicate word With Counts
public class WordCountFromString {
    public static void main(String[] args) {
        String s = "hello how hello how i am";

        //Map<String, Long> collect =

        List<String> list = Stream.of(s.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() >1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(list);
    }
}
