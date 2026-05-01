package Basic_Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find elements gretter than 10
public class findElementsGretter {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,56,78,10,11,23,43);
        List<Integer> newList=nums.stream().filter(n->n>10).collect(Collectors.toList());
        System.out.println(newList);
    }
}
