package Stream.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo2 {
    public static void main(String[] args) {
        List<String> fruits= Arrays.asList("Apple","Banana","Orange","Pineapple");
        List<Integer> lengthOfString=new ArrayList<>();
        for(String s:fruits){
            String.valueOf(lengthOfString.add(s.length()));

        }
        System.out.println(lengthOfString);

        System.out.println("With Stream:");
        lengthOfString=fruits.stream().map(s->s.length()).collect(Collectors.toList());
        System.out.println(lengthOfString);

        System.out.println("-----------------");

        lengthOfString=fruits.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lengthOfString);

    }
}
