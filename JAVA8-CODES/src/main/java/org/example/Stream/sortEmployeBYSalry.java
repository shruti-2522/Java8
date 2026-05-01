package org.example.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sortEmployeBYSalry {

    public static void main(String[] args) {
         List<Employee> l1=new ArrayList<>();

         l1.add(new Employee(1,"Shruti",75000));
         l1.add(new Employee(2,"Aishwarya",1000000));
         l1.add(new Employee(3,"Rashmi",65000));

      //  Collections.sort(l1,(e1,e2)->Double.compare(e1.salary,e2.salary));
        Collections.sort(l1, Comparator.comparing(emp->emp.salary));
        l1.forEach(System.out::println);

        Collections.sort(l1,Comparator.comparing((Employee emp)->emp.salary).reversed());
        System.out.println("Descending Order::");
        l1.forEach(System.out::println);

    }
}
