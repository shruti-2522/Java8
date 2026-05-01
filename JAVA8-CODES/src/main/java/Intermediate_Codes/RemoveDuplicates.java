package Intermediate_Codes;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<String> str= Arrays.asList("Shruti","Sanket","Pratik","Aishwarya","Shruti","Sanket");

        str.stream().distinct().forEach(System.out::println);
    }
}
