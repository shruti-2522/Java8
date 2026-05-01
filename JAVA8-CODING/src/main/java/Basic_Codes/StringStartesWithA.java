package Basic_Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//To check if a list contains any word starting with 'A'
public class StringStartesWithA {

    public static void main(String[] args) {

        List<String> names= Arrays.asList("Shruti","Sanika","Amit","Ankit","anil","Sneha","Pratik");
        List<String> namesStartsWithA=names.stream()
                .filter(s->s.startsWith("A") || s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(namesStartsWithA);
    }
}
