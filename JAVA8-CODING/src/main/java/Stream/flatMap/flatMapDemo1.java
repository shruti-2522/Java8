package Stream.flatMap;

import java.util.*;
import java.util.stream.Collectors;

public class flatMapDemo1 {
    public static void main(String[] args) {
        System.out.println("Map Example:");
        List<Integer> nums= Arrays.asList(1,3,45,6,7,7);
        List<Integer> mapResult=nums.stream()
                .map(n->n+10)
                .collect(Collectors.toList());
        System.out.println(mapResult);

        System.out.println("FlatMap Example:");
        List<Integer> l1=Arrays.asList(1,2);
        List<Integer> l2=Arrays.asList(3,4);
        List<Integer> l3=Arrays.asList(5,6);

        List<List<Integer>> finalList=Arrays.asList(l1,l2,l3);
        System.out.println("Final List:"+finalList);
        List<Integer> newList= finalList.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
        System.out.println(newList);

    }
}

