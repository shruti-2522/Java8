package Revison;

import java.util.*;
import java.util.stream.Collectors;

public class findEvenAndOddNumbers {
    public static void main(String[] args) {

        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Map<Boolean,List<Integer>> even=nums.stream()
                .collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println(even);
    }
}
