package Intermediate_Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class findFirstElement {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 30, 56, 78, 45, 7);

         nums.stream().findFirst().ifPresent(System.out::println);


    }}