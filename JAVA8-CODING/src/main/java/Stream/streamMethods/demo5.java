package Stream.streamMethods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//anyMatch()
//allMatch()
//noneMatch()
public class demo5 {
    public static void main(String[] args) {
        Set<String> fruits= new HashSet<>();
        fruits.add("One Apple");
        fruits.add("One Orange");
        fruits.add("Pineapple");
        fruits.add("Banana");

        System.out.println("anyMatch() Method:");
        boolean result=fruits.stream().anyMatch(s-> {return
                s.startsWith("One");
        });

        System.out.println(result);

        System.out.println("All Match");
        result=fruits.stream().allMatch(s->{
               return s.startsWith("One");
        });
        System.out.println(result);

        System.out.println("None Match:");
        result=fruits.stream()
                .noneMatch(s->{
                   return s.startsWith("Two");
                });
        System.out.println(result);



    }
}
