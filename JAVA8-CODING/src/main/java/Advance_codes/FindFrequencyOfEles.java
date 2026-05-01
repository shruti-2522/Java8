package Advance_codes;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfEles {
    public static void main(String[] args) {

        List<String> stationaryList=Arrays.asList("Pen", "Eraser", "Note Book",
                "Pen", "Pencil", "Stapler", "Note Book", "Pencil");


        Map<String,Long> count=stationaryList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        System.out.println(count);
    }
}
