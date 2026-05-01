package Strings;

public class FirstNonRepeatingChars1 {
    public static void main(String[] args) {
        String s1="aabbcdeffuiAA";
        int arr[]=new int[256];
        for(char ch:s1.toCharArray()){
            arr[ch]++;
        }
        for(char ch:s1.toCharArray()){
            if(arr[ch]==1){
                System.out.println(ch);
                break;
            }
        }
    }
}
