package Basic_Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filter Even Numbers:
public class evenNumbers {
    public static void main(String[] args) {

        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,0);

        List<Integer> evenNos=nums.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNos);

        System.out.println("Second Way");
        nums.stream().filter(n->n%2==0).forEach(System.out::println);



    }
}
