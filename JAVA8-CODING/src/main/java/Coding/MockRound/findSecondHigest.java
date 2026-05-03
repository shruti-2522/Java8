package Coding.MockRound;

import  java.util.*;
public class findSecondHigest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 50, 40);

        Optional<Integer> secondHIghest=list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst();

        System.out.println(secondHIghest.get());
    }
}
