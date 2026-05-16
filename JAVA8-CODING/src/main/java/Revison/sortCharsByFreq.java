package Revison;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class sortCharsByFreq {
    public static void main(String[] args) {
    String s = "aaabbccccdd";

LinkedHashMap<Character,Long> map=    s.chars()
            .mapToObj(c->(char)c)
            .collect(Collectors.groupingBy(c->c,Collectors.counting()))
            .entrySet()
            .stream()
            .sorted(Map.Entry.<Character,Long>comparingByValue().reversed())
            .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (a,b)->a,
                    LinkedHashMap::new
            ));

        System.out.println(map);
}}
