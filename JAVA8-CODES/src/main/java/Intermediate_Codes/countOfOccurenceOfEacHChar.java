package Intermediate_Codes;

import java.util.Map;
import java.util.stream.Collectors;

public class countOfOccurenceOfEacHChar {

    public static void main(String[] args) {

        String str="ShrutiiUutoo";

        Map<Character,Long> count= str.chars().mapToObj(c->(char)c).
                collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println(count);
    }
}
