package Advance_codes;

import java.util.*;
import java.util.stream.Collectors;

public class JoiningStrings {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
       String joinedString= str.stream().collect(Collectors.joining(",","[","]"));
        System.out.println(joinedString);

    }
}
