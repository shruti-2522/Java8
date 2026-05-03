package Coding.MockRound;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class firstNonRepeating {
    public static void main(String[] args) {


        String str = "aabbccdeff";
        Character ch = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .findFirst()
                .orElse(null);

        System.out.println(ch);
    }
}
