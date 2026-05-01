package Stream.streamMethods;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class demo7 {
    public static void main(String[] args) {
        List<String> animals= Arrays.asList("Dog","Lion","Fox","Ox");
        List<String> birds=Arrays.asList("Sparrow","crow","Parrot","kokila");

        Stream<String> s1=animals.stream();
        Stream<String> s2=birds.stream();

        List<String> result=Stream.concat(s1,s2).collect(Collectors.toList());
        System.out.println(result);
    }
}
