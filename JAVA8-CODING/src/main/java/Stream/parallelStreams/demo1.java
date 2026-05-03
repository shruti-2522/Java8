package Stream.parallelStreams;

import java.util.Arrays;
import java.util.List;

public class demo1 {

    public static void main(String[] args) {

        List<Student> students= Arrays.asList(
                new Student("Shashikant",80),
                new Student("Nikita",90),
                new Student("Priyanka",75),
                new Student("Suvarna",65),
                new Student("Vandana",55),
                new Student("Anvar",87),
                new Student("Dipak",77),
                new Student("Eknath",45)
        );

        System.out.println("SequnetiaL Stream:");

        students.stream()
                .filter(s->s.getScore()>80)
                .forEach(s->System.out.println(s.getName()+" "+s.getScore()));

        System.out.println("Parallel Stream");

        students.parallelStream()
                .filter(s->s.getScore()>80)
                .forEach(s->System.out.println(s.getName()+" "+s.getScore()));

        System.out.println("Convert sequential to parallel stream:");

        students.stream().parallel()
                .filter(s->s.getScore()>80)
                .forEach(s->System.out.println(s.getName()+" "+s.getScore()));

    }

}
