package com.biswa;

import com.biswa.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class JavaStreamTest {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L, "John Doe", 50000, 30));
        employees.add(new Employee(2L, "Jane Smith", 60000, 25));
        employees.add(new Employee(3L, "Mike Johnson", 70000, 35));
        employees.add(new Employee(4L, "Emily Davis", 80000, 28));

        // Calculate the average salary of all employees
        double averageSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        System.out.println("Average Salary: " + averageSalary);

        // Find the employee with the highest salary
        Employee highestSalaryEmployee = employees.stream()
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
                .orElse(null);
        System.out.println("Employee with highest salary: " + highestSalaryEmployee.getName() + " - " + highestSalaryEmployee.getSalary());
    }
}
