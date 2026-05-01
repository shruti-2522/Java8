package Stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapDemo2 {

    public static void main(String[] args) {
        List<String> f1= Arrays.asList("Nikita","Hitesh","Vrushali","Pradhunya");
        List<String> f2=Arrays.asList("Bhavna","Bhagi","Divya","Tinu");
        List<String> f3=Arrays.asList("Chetna","Aishwarya","Rashmi","Sakshi");

        List<List<String>> commonFrnds=Arrays.asList(f1,f2,f3);
        System.out.println(commonFrnds);

        List<String> allFrnds=commonFrnds.stream()
                .flatMap(x-> x.stream())
                .collect(Collectors.toList());
        System.out.println(allFrnds);



    }
}
