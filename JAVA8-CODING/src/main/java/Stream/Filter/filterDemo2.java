package Stream.Filter;

import java.util.*;
import java.util.stream.Collectors;

public class filterDemo2 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Shrutaa","Sanket","Pratik","Sneha","Aishwarya","abc");
        List<String> strs=names.stream()
                .filter(s->s.length()>6 && s.length()<8).collect(Collectors.toList());
        System.out.println(strs);

        System.out.println("Without collect:");
        names.stream()
                .filter(s->s.length()>6 && s.length()<8)
                        .forEach(System.out::println);
        //System.out.println(strs);

    }
}
