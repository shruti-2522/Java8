package Strings;

import java.util.HashSet;

public class longestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";

        HashSet<Character> set=new HashSet<>();
        int i=0,j=0;
        int maxlength=0;

        while(j<s.length()){

            char ch=s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                maxlength=Math.max(maxlength,j-i+1);
                j++;
            }else{
                set.remove(s.charAt(i));
                i++;
            }



        }
        System.out.println(maxlength);



    }
}
