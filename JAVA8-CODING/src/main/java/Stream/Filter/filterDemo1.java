package Stream.Filter;
import  java.util.*;
import java.util.stream.Collectors;

public class filterDemo1 {
    public static void main(String[] args) {
//        ArrayList<Integer> nums=new ArrayList<>();
//        nums.add(10);
//        nums.add(67);
//        nums.add(78);
//        nums.add(83);
//        System.out.println("Elements:"+nums);

        System.out.println("Without Stream:");
        List<Integer> nums= Arrays.asList(10,67,78,83);
        List<Integer> evenNos=new ArrayList<>();
        for(Integer n:nums){
            if(n%2==0)
            evenNos.add(n);
        }
        System.out.println(evenNos);

        System.out.println("With Stream:");
        evenNos=nums.stream()
                                   .filter(n->n%2==0)
                                   .collect(Collectors.toList());
        System.out.println(evenNos);


    }
}
