package Stream.Map;

import java.util.*;
import java.util.stream.Collectors;

public class mapDemo3 {
    public static void main(String[] args) {

        List<Integer> nums= Arrays.asList(10,45,57,67,89,89);

        List<Integer> result=nums.stream()
                                  .map(n->n*3)
                                   .collect(Collectors.toList());

        System.out.println(result);
    }
}
