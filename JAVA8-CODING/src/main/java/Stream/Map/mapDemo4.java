package Stream.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo4 {
    public static void main(String[] args) {

        List<Employee> emp= Arrays.asList(
                new Employee(1,"Shruti Amrutkar",75000),
                new Employee(2,"Aishwarya Kunder",95000),
                new Employee(3,"Rashmi Tambadkar",150000),
                new Employee(4,"Pratik Amrutkar",10000));


        List<Integer> result=emp.stream()
                .filter(e->e.salary<50000)
                .map(e->e.salary)
                .collect(Collectors.toList());

        System.out.println(result);


    }
}
