package org.example.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertUppercase {

    public static void main(String[] args) {
        List<String> s1= Arrays.asList("Shruti","adf222","Manisha","Niki","sd");

        List<String> h=s1.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(h);
    }
}
