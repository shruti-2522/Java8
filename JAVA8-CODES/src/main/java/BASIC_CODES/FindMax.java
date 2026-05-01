package BASIC_CODES;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMax {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        Optional<Integer> max = list.stream().max(Integer::compare);
        System.out.println(max.get());
    }
}
