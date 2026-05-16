package Basic_Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//second Highest
public class findSecondHighestElement {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(10,20,100,456,20,765);

       Optional<Integer> secondHighest= nums.stream()
               .sorted((a, b)->b.compareTo(a)).
               skip(1).findFirst();

        System.out.println(secondHighest.get());

    }
}
