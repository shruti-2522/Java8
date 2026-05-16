package Revison;

import java.util.Arrays;
import java.util.HashSet;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromLoist {

    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,1,3,45,6,7,8,8,0);

        Set<Integer> set=new HashSet<>();

       List<Integer> num1= nums.stream().distinct()
               .collect(Collectors.toList());

       nums.stream().filter(c->set.add(c)).forEach(System.out::println);

        System.out.println(num1);
    }
}
