package Coding.Intermediate;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class convertListToMap {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("shruti","pratik","sneha","Manisha");

        Map<String,Integer> map=names.stream()
                .collect(Collectors.toMap(
                        s->s, s->s.length()
                ));

        System.out.println(map);
    }
}
