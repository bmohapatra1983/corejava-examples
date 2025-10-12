package com.biswa.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepeatingCharacterTest {
    public static void main(String[] args) {
        String s ="aabbccccdd";

        Optional<Map.Entry<Character, Long>> max = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue());
        System.out.println(max.get().getKey());

    }
}
