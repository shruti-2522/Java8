package Basic_Codes;

import java.util.*;

//numbers are negative
public class numberAreNegative {
    public static void main(String[] args) {

        List<Integer> nums= Arrays.asList(1,2,5,6,7,8);
        boolean result=nums.stream().noneMatch(n->n<0);
        System.out.println(result);

    }
}
