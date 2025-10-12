package com.biswa.java8;

import com.biswa.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L, "John Doe", 50000,"IT",  30));
        employees.add(new Employee(2L, "Jane Smith", 60000,"Finance",25));
        employees.add(new Employee(3L, "Mike Johnson", 70000,"HR", 35));
        employees.add(new Employee(4L, "Emily Davis", 80000,"Marketing",28));
        employees.add(new Employee(5L, "Karen Smith", 90000,"Marketing",32));
        employees.add(new Employee(6L, "Robert Johnson", 100000,"IT", 38));
        employees.add(new Employee(7L, "Sarah Smith", 110000,"HR", 33));
        employees.add(new Employee(8L, "Lisa Smith", 120000,"IT", 37));
        employees.add(new Employee(9L, "Paul Smith", 130000,"Marketing",36));
        employees.add(new Employee(10L, "George Smith", 140000,"Marketing", 31));

        Map<String, Long> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        System.out.println(collect.entrySet().stream().skip(1).findFirst().get());

    }
}
