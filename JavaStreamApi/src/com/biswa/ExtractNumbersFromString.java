package com.biswa;

import java.util.stream.Collectors;

public class ExtractNumbersFromString {
    public static void main(String[] args) {
        String input = "Biswaranjan123";
        String numbers = input.chars()
                .filter(Character::isDigit)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println("Extracted numbers: " + numbers);
    }
}
