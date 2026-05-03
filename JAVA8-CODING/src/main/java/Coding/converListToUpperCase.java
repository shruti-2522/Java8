package Coding;

import java.util.*;
import java.util.stream.Collectors;
//Convert list to uppercase
public class converListToUpperCase {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("shruti","nikita","priya","pooja");
        List<String> uppercase=names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercase);


    }
}
