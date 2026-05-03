package Coding.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mergeTwoList {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("shruti","pratik","Sneha");
        List<String> l2=Arrays.asList("Sanket","Atharw");

        List<String> concatenedStr= Stream.concat(l1.stream(),l2.stream())
                .collect(Collectors.toList());

        System.out.println(concatenedStr);
    }
}
