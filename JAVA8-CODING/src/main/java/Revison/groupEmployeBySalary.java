package Revison;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupEmployeBySalary {

    public static void main(String[] args) {


        List<Employee> l1 = Arrays.asList(
                new Employee(1, "Shruti", 50000, "IT"),
                new Employee(2, "Amit", 70000, "HR"),
                new Employee(3, "Neha", 90000, "IT"),
                new Employee(4, "Rahul", 80000, "Admin")
        );
       Map<Double,List<Employee>> mapa= l1.stream().
               collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(mapa);


    }
}
