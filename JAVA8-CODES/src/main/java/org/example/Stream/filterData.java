package org.example.Stream;

import java.util.Arrays;
import java.util.List;

public class filterData {

    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(10,40,40,50,78,89);

        l1.stream().filter(x->x>10)
                .map(x->x*2).sorted().distinct()
                .forEach(System.out::println);

    }
}
