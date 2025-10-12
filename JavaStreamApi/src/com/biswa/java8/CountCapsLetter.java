package com.biswa.java8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCapsLetter {
    public static void main(String[] args) {
        String name ="ab123ab";

        Map<String, Long> collect = name.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        ch -> Character.isDigit(ch) ? "Digit" : "Character",
                        Collectors.counting()
                ));

        System.out.println(collect);

    }
}
