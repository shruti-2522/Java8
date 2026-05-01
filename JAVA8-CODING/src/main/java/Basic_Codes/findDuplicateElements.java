package Basic_Codes;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Find duplicate Elements in list
public class findDuplicateElements {

    public static void main(String[] args) {

        List<Integer> nums= Arrays.asList(1,2,2,45,6,7,45,7,8,9,0);
        Set<Integer> seen=new HashSet<Integer>();
        List<Integer> duplicates=nums.stream()
                .filter(i->!seen.add(i))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(duplicates);


    }
}
