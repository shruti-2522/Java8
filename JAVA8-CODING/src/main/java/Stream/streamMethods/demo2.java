package Stream.streamMethods;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class demo2 {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       //count
        long eveNos=nums.stream()
                .filter(n->n%2==0)
                .count();
        System.out.println(eveNos);

        //min
        Optional<Integer> minimum= nums.stream()
                .min((a,b)->{return a.compareTo(b);});
        System.out.println("Minimum elements:"+minimum.get());

        //Max
        Optional<Integer> max=nums.stream()
                .max((a,b)->{ return a.compareTo(b);});
        System.out.println("Maximum Ele:"+max.get());

    }
}
