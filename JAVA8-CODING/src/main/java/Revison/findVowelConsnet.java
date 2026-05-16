package Revison;

import java.util.Locale;

public class findVowelConsnet {

    public static void main(String[] args) {
        String s="Shruti Amrutkar";

        long voewl=s.toLowerCase()
                .chars()
                .mapToObj(c->(char)c)
                .filter(ch->"aeiou".indexOf(ch)!=-1)
                .count();

        System.out.println(voewl);

        long consent=s.toLowerCase()
                .chars()
                .mapToObj(c->(char)c)
                .filter(ch->ch>='a' && ch<='z')
                .filter(ch->"aeiou".indexOf(ch)==-1)
                .count();

        System.out.println(consent);

    }
}
