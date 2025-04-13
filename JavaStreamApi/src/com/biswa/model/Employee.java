package com.biswa.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private float salary;
    private int age;
}
