package Basic_Codes;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Merge two list into single list
public class mergerTwoListIntoSIngles {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("Niki","Hitesh","Vrushali","Pradhunya");
        List<String> l2= Arrays.asList("Shruti","Bhavna","Bhagi");
        List<String> l3= Stream.concat(l1.stream(),l2.stream()).collect(Collectors.toList());
        System.out.println(l3);




    }
}
