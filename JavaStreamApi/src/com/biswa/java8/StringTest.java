package com.biswa.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringTest {
    public static void main(String[] args) {
        String s = "12B33is43a9";

        Map<String, List<Character>> collect = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> Character.isAlphabetic(c) ? "chars" : "digit"));

        System.out.println(collect);

    }
}
