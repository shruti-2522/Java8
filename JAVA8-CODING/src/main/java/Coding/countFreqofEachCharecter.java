package Coding;

import java.util.Map;
import java.util.stream.Collectors;

//Count frequency of characters
public class countFreqofEachCharecter {
    public static void main(String[] args) {
        String s="ShrutiAmrutkarShruti";

        Map<Character,Long> freqMap=s.chars().mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println(freqMap);

    }
}
