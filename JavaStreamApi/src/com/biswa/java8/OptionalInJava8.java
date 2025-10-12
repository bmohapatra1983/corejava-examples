package com.biswa.java8;

import java.util.Optional;

public class OptionalInJava8 {
    public static void main(String[] args) {
        String name = "Biswa";
        String n = null;

        //String hi = Optional.ofNullable(name).orElse(orGet());
        String hi = Optional.ofNullable(n).orElseGet(OptionalInJava8::orGet);
        System.out.println(hi);
    }

    static String orGet(){
        System.out.println("--orGet--");
        return "orGet";
    }
}
