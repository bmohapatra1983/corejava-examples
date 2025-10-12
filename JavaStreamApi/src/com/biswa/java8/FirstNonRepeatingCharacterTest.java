package com.biswa.java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterTest {
    public static void main(String[] args) {
        String input = "aaaabbccccllkjujggdzxzzzxxchjjkhaksalsslkshisgyasfsaualsjask";

        Map<Character, Long> collect = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

        System.out.println(collect);

    }
}
