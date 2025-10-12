package com.biswa.java8;

import com.biswa.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentStreamTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Biswa",40,"Male"));
        students.add(new Student("Aditri",30,"Female"));
        students.add(new Student("Deepika",18,"Female"));
        students.add(new Student("Goodlee",30,"Male"));
        students.add(new Student("Subham",18,"Male"));

        List<String> list = students.stream()
                .filter(s -> s.getAge() <= 18)
                .map(Student::getName)
                .toList();
        System.out.println(list);


    }
}
