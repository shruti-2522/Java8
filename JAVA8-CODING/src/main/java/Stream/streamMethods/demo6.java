package Stream.streamMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class demo6 {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Hitesh","Niki","Vrushali","Pradhunya");

        System.out.println("findAny() Method:");
        Optional<String> findElements=names.stream()
                .findAny();
        System.out.println(findElements.get());

        System.out.println("findFirst() method:");
        findElements=names.stream().findFirst();
        System.out.println(findElements.get());

    }
}
