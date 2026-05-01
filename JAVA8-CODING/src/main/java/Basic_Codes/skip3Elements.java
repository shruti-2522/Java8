package Basic_Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//skip three elements
public class skip3Elements {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple","Banana","Mango","Orange","pineapple");

        List<String> newList=fruits.stream().skip(3).collect(Collectors.toList());
        System.out.println(newList);

    }
}
