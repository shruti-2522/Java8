package Coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find even numbers
public class EvenNos {

    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,90);

        List<Integer> evenNos=nums.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers:"+evenNos);
    }

}
