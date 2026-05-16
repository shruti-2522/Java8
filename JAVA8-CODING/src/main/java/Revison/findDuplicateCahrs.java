package Revison;

import java.util.HashSet;
import java.util.Set;

public class findDuplicateCahrs {

    public static void main(String[] args) {


    String s="shrutissii";

    Set<Character> set=new HashSet<>();

    s.chars()
            .mapToObj(c->(char)c)
            .filter(c->!set.add(c))
            .forEach(System.out::println);
    }

}
