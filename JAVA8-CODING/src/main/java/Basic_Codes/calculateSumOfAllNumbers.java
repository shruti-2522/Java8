package Basic_Codes;

import java.util.Arrays;
import java.util.List;
//Sum of all elements
public class calculateSumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,5,67,7);
        int sum=nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
