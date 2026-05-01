package org.example.Stream;

import java.util.Arrays;
import java.util.List;

public class countString {

    public static void main(String[] args) {

        List<String> s1= Arrays.asList("Shruti","adf222","Manisha","Niki","sd");

        long count=s1.stream().filter(s->s.length()>3).count();

        System.out.println(count);

    }
}
