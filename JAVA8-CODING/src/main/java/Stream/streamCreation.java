package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamCreation {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("Shruti","Pratik","Naman");
        Stream<String>  s1=list.stream();



    }
}
