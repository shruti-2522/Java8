package Strings;

public class ReverseWordsInSentrence1 {

    public static void main(String[] args) {
        String s="I Love Java";

        String words[]=s.split(" ");
        String result="";

        for(int i= words.length-1;i>=0;i--){
            result+=words[i]+" ";

        }
        System.out.println(result);
    }
}
