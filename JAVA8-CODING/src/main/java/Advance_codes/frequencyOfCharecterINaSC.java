package Advance_codes;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class frequencyOfCharecterINaSC {
    public static void main(String[] args) {
        String s="aaaabbbcfffddduytfjl";

       Map<Character ,Long> count= s.chars()
               .mapToObj(c->(char) c)
               .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
               .entrySet()
               .stream()
               .sorted(Map.Entry.comparingByValue())
               .collect(Collectors.toMap(Map.Entry::getKey,
                       Map.Entry::getValue,
                       (a,b)->a,LinkedHashMap::new));

        System.out.println(count);
    }
}
