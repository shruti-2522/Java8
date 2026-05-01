package Stream.Map;

import java.util.*;
import java.util.stream.Collectors;

public class mapDemo1 {
    public static void main(String[] args) {
        List<String> vehicles= Arrays.asList("bmw","Suzuki","Car","Bike");
        List<String> upperCase=new ArrayList<>();

        //Without Stream
        for(String s:vehicles){
            upperCase.add(s.toUpperCase());

        }
        System.out.println(upperCase);

        //With stream:
        System.out.println("---------------------");
        upperCase=vehicles.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCase);

        System.out.println("----------------");
        upperCase=vehicles.stream()
                .map(n->n.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(upperCase);


    }
}
