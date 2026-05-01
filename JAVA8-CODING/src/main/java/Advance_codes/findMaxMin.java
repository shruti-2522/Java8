package Advance_codes;
import java.util.*;
public class findMaxMin {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        int max=listOfIntegers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("Maximum::"+max);

        int min=listOfIntegers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Minimum:"+min);

    }
}
