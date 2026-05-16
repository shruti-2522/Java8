package Revison;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class seconfHighest {
    public static void main(String[] args) {


        List<Employee> emps = Arrays.asList(
                new Employee(1, "Shruti", 50000, "IT"),
                new Employee(2, "Amit", 70000, "HR"),
                new Employee(3, "Neha", 90000, "IT"),
                new Employee(4, "Rahul", 80000, "Admin")
        );

        Employee second=emps.stream().sorted(Comparator.comparing(Employee::getSalary))
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(second);
    }

}
