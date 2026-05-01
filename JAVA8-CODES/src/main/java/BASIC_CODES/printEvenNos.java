package BASIC_CODES;

import java.util.Arrays;
import java.util.List;

public class printEvenNos {

    public static void main(String[] args) {

        List<Integer> nums= Arrays.asList(20,30,56,43,93,68,7);

        nums.stream().filter(n->n%2==0).forEach(System.out::println);

    }
}
