package Basic_Codes;

//convert list of integers to squares

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverSqures {
    public static void main(String[] args) {

        List<Integer> l1= Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> squares=l1.stream().map(n->n*n)
                            .collect(Collectors.toList());
        System.out.println(squares);
    }
}
