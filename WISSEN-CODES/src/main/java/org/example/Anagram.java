package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1="listen";
        String str2="silent";

        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2));
    }
}

