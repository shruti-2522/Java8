package Advance_codes;

import java.util.*;

public class multiplesOf5 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        list.stream().filter(i->i%5==0).forEach(System.out::println);
    }
}
