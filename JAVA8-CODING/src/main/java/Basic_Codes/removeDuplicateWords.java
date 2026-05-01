package Basic_Codes;


//Remove Duplicate Words
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removeDuplicateWords {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("Shruti","Shruti","sxdfgh","ABCD","Niki","Niki");
        List<String> duplicateWords=words.stream().distinct().collect(Collectors.toList());
        System.out.println(duplicateWords);


    }
}
