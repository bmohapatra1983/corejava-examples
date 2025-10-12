package com.biswa.java8;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        String name ="a1b2c44b5";
        List<Integer> list = name.chars().mapToObj(c -> (char) c)
                .filter(Character::isDigit)
                .map(c -> c - '0')
                .toList();

        System.out.println(list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

    }
}
