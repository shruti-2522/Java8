package Coding;

import java.util.*;
import java.util.stream.Collectors;

//Sort list of strings
public class sortListOfStrings {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("shruti","aniket","sai","sumita","pratik");
        List<String> sortedList=names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList);

    }
}
