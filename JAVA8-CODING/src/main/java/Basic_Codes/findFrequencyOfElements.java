package Basic_Codes;

import java.util.*;
import java.util.stream.Collectors;

//find frequemcy of elements
public class findFrequencyOfElements {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple","Banana","Apple","Orange","Banana","Apple");
        Map<String,Long> map=fruits.stream()
                                    .collect(Collectors.groupingBy(w->w,Collectors.counting()));
        System.out.println(map);
    }

}

