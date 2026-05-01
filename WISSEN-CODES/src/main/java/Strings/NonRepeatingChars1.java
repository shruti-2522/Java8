package Strings;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class NonRepeatingChars1 {

    public static void main(String[] args) {

        String s1="aabbcdeff";

        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char ch:s1.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey()+":"+entry.getValue());
               return;
            }

        }

    }
}
