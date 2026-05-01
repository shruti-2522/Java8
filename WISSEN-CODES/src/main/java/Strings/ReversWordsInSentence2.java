package Strings;

public class ReversWordsInSentence2 {
    public static void main(String[] args) {

        String str1="I Love Mani Mau";
        String words[]= str1.split(" ");

        StringBuilder s1=new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            s1.append(words[i]).append(" ");
        }

        System.out.println(s1);
    }
}
