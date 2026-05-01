package Stream.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class demo1 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Shruti","Shruti","Sneha","Pratik","Sneha","Aniket");
        List<String> distinctElements=names.stream()
                                           .distinct()
                                           .collect(Collectors.toList());

        System.out.println(distinctElements);

        System.out.println("Using forEach");
        names.stream()
                .distinct()
                .forEach(x-> System.out.println(x));

        //Count
        Long count=names.stream()
                .distinct()
                .count();
        System.out.println("Count of Distinct Elements:"+count);

        //Limit method
        System.out.println("Limit method:");
        distinctElements=names.stream().distinct().limit(3)
                                       .collect(Collectors.toList());
        System.out.println(distinctElements);

    }
}
