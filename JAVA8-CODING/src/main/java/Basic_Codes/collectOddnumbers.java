package Basic_Codes;

import java.util.*;
import java.util.stream.Collectors;

public class collectOddnumbers {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

       Set<Integer> oddNums= nums.stream().filter(n->n%2!=0).collect(Collectors.toSet());
        System.out.println(oddNums);

    }

}
