package com.biswa;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindDigitsFromString {
    public static void main(String[] args) {
        String s= "biswa417biswa3";

        List<Integer> sorted = s.chars().mapToObj(c -> (char) c)
                .filter(Character::isDigit)
                .mapToInt(Character::getNumericValue)
                .boxed()
                .sorted(Comparator.reverseOrder()).toList();
        System.out.println(sorted);
    }
}