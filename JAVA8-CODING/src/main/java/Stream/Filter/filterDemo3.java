package Stream.Filter;

import java.util.*;
import java.util.stream.Collectors;

//Remove null from List
public class filterDemo3 {
    public static void main(String[] args) {

        List<String> str= Arrays.asList(null,"Apple","Banana","Orange");
        List<String> removeNullList=str.stream()
                .filter(s->s!=null).collect(Collectors.toList());
        System.out.println(removeNullList);

    }
}
