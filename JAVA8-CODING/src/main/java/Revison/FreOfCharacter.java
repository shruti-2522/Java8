package Revison;

import java.util.*;
import java.util.stream.Collectors;

public class FreOfCharacter {
    public static void main(String[] args) {

        String s="asbbbsdddkkio";

        Map<Character,Long> freqMap=s.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));

        System.out.println("count of occurencess::"+freqMap);

        System.out.println("Count of occurences in ascending Order:");
        freqMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(e1-> System.out.print(e1.getKey()+": "+e1.getValue()+" "));
        System.out.println(" ");

        System.out.println("Count of occurences in descending order");
        freqMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Character,Long>comparingByValue().reversed()).forEach(
                        e1-> System.out.println(e1.getKey()+":"+ e1.getValue())
                );

    }
}
