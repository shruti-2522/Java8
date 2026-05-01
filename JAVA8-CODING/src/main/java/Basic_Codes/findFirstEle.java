package Basic_Codes;

import java.util.*;
//Find First Element
public class findFirstEle {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Apple","Banana","Orange");
        names.stream().findFirst().ifPresent(System.out::println);
    }
}
