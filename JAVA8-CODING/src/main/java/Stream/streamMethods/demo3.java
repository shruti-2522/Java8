package Stream.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class demo3 {
    public static void main(String[] args) {
        List<String> strs= Arrays.asList("A","b","c","1","2","3");
       Optional<String> newStr= strs.stream()
               .reduce((a, b)->{
            return a+b;
        });

        System.out.println(newStr.get());

    }
}
