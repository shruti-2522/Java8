package ADVANCE_CODES;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partitionNumber {

    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(20,30,56,43,93,68,7);

        Map<Boolean,List<Integer>> eNums=nums.stream()
                .collect(Collectors.partitioningBy(n->n%2!=0));

        System.out.println(eNums);

    }
}
