package Stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapDemo3 {
    public static void main(String[] args) {

        List<Student> students1= Arrays.asList(
                new Student(1,"Sakshi","A"),
                new Student(2,"Aishwatya","B"),
                new Student(3,"Pratik","K")
        );

        List<Student> students2= Arrays.asList(
                new Student(1,"Niki","A"),
                new Student(2,"Hitesh","B"),
                new Student(3,"Pradhunya","K")
        );


        List<List<Student>> finalList=Arrays.asList(students1,students2);

        List<String> result=finalList.stream()
                .flatMap(s->s.stream())
                .map(s1->s1.name)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
