package Intermediate_Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupStringByLength {
  List<Integer> nums = Arrays.asList(10, 30, 56, 78, 45, 7);

    public static void main(String[] args) {

        List<String> strs= Arrays.asList("Shruti","Nikita","Hitesh","shr","nik","sank");
        Map<Integer, List<String>> list=strs.stream().collect(Collectors.groupingBy(String::length));

        System.out.println(list);
    }
}
