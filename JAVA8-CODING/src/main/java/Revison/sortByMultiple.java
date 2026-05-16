package Revison;

import java.util.*;

public class sortByMultiple {
    public static void main(String[] args) {


        List<Employee> l1 = Arrays.asList(
                new Employee(1, "Shruti", 50000, "IT"),
                new Employee(2, "Amit", 70000, "HR"),
                new Employee(3, "Neha", 90000, "IT"),
                new Employee(4, "Rahul", 80000, "Admin")
        );

        l1.stream().sorted(Comparator.comparing(Employee::getSalary)
                .thenComparing(Employee::getEmpname)).forEach(System.out::println);



    }
}
