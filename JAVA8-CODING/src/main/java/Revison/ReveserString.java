package Revison;

public class ReveserString {

    public static void main(String[] args) {

        String s="Shruti";

       String rev= s.chars()
                .mapToObj(c->(char)c)
                .reduce("",
                        (str,ch)->ch+str,
                (s1,s2)->s1+s2);

        System.out.println(rev);




    }
}
