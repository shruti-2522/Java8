package Coding.Intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapPrograme {
    public static void main(String[] args) {

        List<List<Integer>> nestedStream= Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7)
        );

        List<Integer> flatList=nestedStream.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList);


    }
}
