package Basic_Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//PartitionEvenNumbers
public class parttionEvenNumber {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,3,4,56,7,8,9,0,11,23);

       Map<Boolean,List<Integer>> map= nums.stream()
               .collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println(map);

    }
}
