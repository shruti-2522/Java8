package Basic_Codes;

import java.util.Arrays;
import java.util.List;

//find length of longest string
public class findLengthofLongestString {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("shruti","niki","Aishwarya");
        int longLength=list.stream().mapToInt(String::length).max().orElse(0);
        System.out.println(longLength);
    }
}
