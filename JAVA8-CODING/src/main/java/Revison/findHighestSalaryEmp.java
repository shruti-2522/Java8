package Revison;

import jdk.nio.mapmode.ExtendedMapMode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class findHighestSalaryEmp {
    public static void main(String[] args) {


        List<Employee> l1 = Arrays.asList(
                new Employee(1, "Shruti", 50000, "IT"),
                new Employee(2, "Amit", 70000, "HR"),
                new Employee(3, "Neha", 90000, "IT"),
                new Employee(4, "Rahul", 80000, "Admin")
        );

        Employee max=l1.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .findFirst().orElse(null);

        System.out.println(max);

    }
}
