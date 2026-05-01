package BASIC_CODES;

import java.util.Arrays;
import java.util.List;

public class sortList {

    public static void main(String[] args) {

        List<Integer> nums= Arrays.asList(10,54,65,43,0,1);

        nums.stream().sorted().forEach(System.out::println);
    }
}
