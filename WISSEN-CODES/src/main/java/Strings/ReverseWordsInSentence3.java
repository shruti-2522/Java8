package Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInSentence3 {

    public static void main(String[] args) {
        String s1="I love Programming";

        List<String> l1= Arrays.asList(s1.split(" "));
        Collections.reverse(l1);
        System.out.println(String.join(" ",l1));

    }
}
