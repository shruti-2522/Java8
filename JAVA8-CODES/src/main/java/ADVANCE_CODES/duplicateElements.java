package ADVANCE_CODES;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateElements {

    public static void main(String[] args) {
        List<Integer> nums =Arrays.asList(10,39,10,67,67,54,45);

        Set<Integer> set=new HashSet<>();

        nums.stream().filter(n->!set.add(n)).forEach(System.out::println);



    }
}
