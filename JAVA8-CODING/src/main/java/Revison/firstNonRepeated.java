package Revison;

import java.util.stream.Collectors;

public class firstNonRepeated {

    public static void main(String[] args) {
        String s="aabbcddffghjk";

        Character ch=s.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()==1)
                .map(e->e.getKey())
                .findFirst()
                .orElse(null);

        System.out.println(ch);

    }
}
