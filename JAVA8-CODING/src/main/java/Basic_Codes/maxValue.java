package Basic_Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Find max Number
public class maxValue {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,567,1000,676,5);
        Optional<Integer> maxNumber=num.stream().max(Integer::compareTo);
        System.out.println(maxNumber.get());

    }
}
