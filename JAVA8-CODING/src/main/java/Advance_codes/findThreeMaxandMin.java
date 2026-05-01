package Advance_codes;

import java.util.*;
public class findThreeMaxandMin {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        System.out.println("Mininum Numbers::");
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
        System.out.println("Maximum Numbers:");
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3)
                .forEach(System.out::println);

    }

}
