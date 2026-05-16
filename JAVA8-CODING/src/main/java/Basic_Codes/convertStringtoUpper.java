package Basic_Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//convert string to uppercase
public class convertStringtoUpper {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("shruti","sneha","pratik","manisha");
        List<String> result=names.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
