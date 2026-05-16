package Basic_Codes;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Write a programe in java group strings by their length
public class groupStringByTheirLength {
    public static void main(String[] args) {

        List<String> fruits= Arrays.asList("Apple","Banana","Orange","Mango","Peer","grapes");
         Map<Integer,List<String>> groupsStrings=fruits.stream()

                 .collect(Collectors.groupingBy(String::length));
        System.out.println(groupsStrings);

    }
}
