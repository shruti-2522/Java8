package Revison;

import java.util.Arrays;
import java.util.Map;
import java.util.Arrays;
import java.util.stream.Collectors;

public class findFrequnecyOfWords {

    public static void main(String[] args) {
        String s="java java spring";

        Map<String,Long> freMap= Arrays.stream(s.split(" "))
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println(freMap);
    }
}
