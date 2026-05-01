package org.example.Stream;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);

        int maxNumber=list.stream().max(Integer::compare).get();
        System.out.println(maxNumber);


    }


}
