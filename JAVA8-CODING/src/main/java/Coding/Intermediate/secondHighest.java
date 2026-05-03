package Coding.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class secondHighest {
    public static void main(String[] args) {

        List<Integer> nums= Arrays.asList(1,3,45,65,68,90);

        Optional<Integer> max =nums.stream()
                        .sorted(Comparator.reverseOrder())
                                .skip(1).findFirst();

        System.out.println(max.get());



    }
}
