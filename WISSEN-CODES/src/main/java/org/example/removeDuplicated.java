package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicated {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4};

        Set<Integer> set=new LinkedHashSet<>();

        for(int ele:arr){
            set.add(ele);

        }
        System.out.println(set);
    }
}
