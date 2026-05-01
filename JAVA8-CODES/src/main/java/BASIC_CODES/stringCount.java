package BASIC_CODES;

import java.util.Arrays;
import java.util.List;

public class stringCount {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("shr","pra","hjkkkk","Aishwarya");

        long count=str.stream().filter(s->s.length()>1).count();
        System.out.println(count);

    }
}
