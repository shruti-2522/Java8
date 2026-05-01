//package Strings;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.Stack;
//
//public class palindromeCheck {
//
//    public static void main(String[] args) {
//
//        String s = "()[]{}";
//
//        Stack<Character> set=new Stack<>();
//         boolean valid=true;
//
//         for(int i=0;i<s.length();i++){
//             char ch=s.charAt(i);
//
//             if(ch=='(' || ch=='{' || ch =='['){
//                 set.push(ch);
//             }
//             else {
//                 if(set.isEmpty()){
//                     valid=false;
//                     break;
//                 }
//
//                 char top=set.pop();
//
//                 if((ch==')' && top!=='(') || (ch=='}' && top !='{') || (ch==']' && ch=='[')){
//                     valid=false;
//                     break;
//                 }
//
//             }
//
//
//
//         }
//
//
//
//    }
//}
