package Basic_Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//flattern list

public class flatternListOfListr {

    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3);
        List<Integer> l2= Arrays.asList(4,5,6);
        List<List<Integer>> flatternList=Arrays.asList(Arrays.asList(20,30,40),l1,l2);
         List<Integer> newList= flatternList.stream().flatMap(List::stream).collect(Collectors.toList());
         System.out.println(newList);
    }
}
