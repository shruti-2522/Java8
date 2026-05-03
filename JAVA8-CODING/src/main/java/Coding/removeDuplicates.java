package Coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Remove duplicates
public class removeDuplicates {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,1,2,3,4,5,6,2,3);
        List<Integer> duplicateEles=nums.stream()
                        .distinct()
                         .collect(Collectors.toList());

        System.out.println(duplicateEles);
        System.out.println("Second Approach:");
        Set<Integer> newSer=nums.stream().collect(Collectors.toSet());

        System.out.println(newSer);



    }

}
