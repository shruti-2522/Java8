package Basic_Codes;


import java.util.*;
import java.util.stream.Collectors;

//check all elements are possitive
public class elementsArePossitive {

    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,-1,4,50,78,0);

        boolean matcNumber=nums.stream().allMatch(n->n>0);
        System.out.println(matcNumber);
    }
}
