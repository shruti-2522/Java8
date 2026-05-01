package Basic_Codes;

import java.util.*;

public class findSmallestElement {

    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(-1,45,67,89,43,57);
        Optional<Integer> minimumEle=nums.stream().min(Integer::compareTo);
        System.out.println(minimumEle.get());
    }
}
