package Coding.Intermediate;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class groupEmpByDeptmt {

    public static void main(String[] args) {

        List<Employe> emps = Arrays.asList(
                new Employe(1, "Rashmi", "Testing"),
                new Employe(2, "Aishwarya", "Development"),
                new Employe(3, "Shruti", "Development"),
                new Employe(4, "Shubhangi", "Development"),
                new Employe(4, "Akshy", "frontEnd")
        );

        Map<String,List<Employe>> emps1=emps
                .stream()
                .collect(Collectors.groupingBy(Employe::getDepartment));

        emps1.forEach((dept,emplsit)->{
            System.out.println(dept+" "+emplsit);
        });
    }
}
