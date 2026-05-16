package Revison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWordInString {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("Shruti","Sanket","Pratik");
        List<String> str= list.stream()
                .map(s->new StringBuilder(s).reverse().toString())
                .collect(Collectors.toList());

        System.out.println(str);

    }
}
