package BASIC_CODES;

import java.util.Arrays;
import java.util.List;

public class listToUpperCase {

    public static void main(String[] args) {

        List<String> str= Arrays.asList("Shruti","Sanket","Pratik");

        str.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
