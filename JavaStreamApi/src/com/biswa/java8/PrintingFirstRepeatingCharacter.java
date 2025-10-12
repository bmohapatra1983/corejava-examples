package com.biswa.java8;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintingFirstRepeatingCharacter {
    public static void main(String[] args) {
        String s = "baaxccdaiswa";
        s.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting())

                ).entrySet().stream()
                .filter(e -> e.getValue() > 1)                 // keep only repeating characters
                .map(e -> e.getKey())                          // get the character
                .findFirst()                                   // first in insertion order
                .ifPresentOrElse(
                        ch -> System.out.println("First repeating character: " + ch),
                        () -> System.out.println("No repeating character found")
                );

    }
}
