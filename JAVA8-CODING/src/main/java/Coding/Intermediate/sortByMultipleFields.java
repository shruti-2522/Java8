package Coding.Intermediate;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortByMultipleFields {
    public static void main(String[] args) {
        List<Employe> emps = Arrays.asList(
                new Employe(1, "Rashmi", "Testing"),
                new Employe(2, "Aishwarya", "Development"),
                new Employe(3, "Shruti", "Development"),
                new Employe(4, "Shruti", "Development"),
                new Employe(5, "Akshay", "frontEnd")
        );

        List<Employe> sortEmp = emps.stream()
                .sorted(Comparator.comparing(Employe::getDepartment)
                        .thenComparing(Employe::getEmpName)
                        .thenComparing(Employe::getEmpid))
                .collect(Collectors.toList());

        System.out.println(sortEmp);
    }
}
