package Intermediate_Codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class findSecondHighest {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 30, 56, 78, 45, 7);

        nums.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().
                ifPresent(System.out::println);

    }
}
