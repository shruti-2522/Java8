package org.example.Stream;

import java.util.*;
import java.util.stream.Collectors;


public class FilterEvenNos {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);

       List<Integer> result= list.stream().filter(z->z%2==0)
                .collect(Collectors.toList());

        System.out.println(result);
    }

}
