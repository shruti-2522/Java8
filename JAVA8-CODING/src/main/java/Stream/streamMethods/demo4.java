package Stream.streamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class demo4 {
    public static void main(String[] args) {
        //sorted
        List<Integer> nums= Arrays.asList(10,43,56,78,88,65,90,4,5);
        List<Integer> sortEles=nums.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Ascending order:"+sortEles);

        sortEles=nums.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Descending order:"+sortEles);

        //String
        System.out.println("For Strings:");
        List<String> strs=Arrays.asList("shruti","neha","pratik","anamika","ankit");
        List<String> sortedStr=strs.stream().sorted()
                .collect(Collectors.toList());
        System.out.println("Ascending order:"+sortedStr);

        sortedStr=strs.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("Descending Order:"+sortedStr);
    }
}
