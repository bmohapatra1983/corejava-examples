package com.biswa;

public class CountZeroInBinary {
    public static void main(String[] args) {
        int n = 10;
        StringBuilder binary = new StringBuilder();

        while (n != 0) {
            binary.append(n % 2);
            n /= 2;
        }

        System.out.println("Binary representation: " + Integer.parseInt(binary.reverse().toString()));

    }
}

