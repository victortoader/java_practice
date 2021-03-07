package streamspractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) throws IOException {
        IntStream.range(1, 10).skip(5).forEach(System.out::println);
        IntStream.range(1, 22).skip(5).forEach(x->System.out.println(x));
        System.out.println("---");
        System.out.println(IntStream.range(1, 5).sum());


        Stream.of("Ava", "Aneri", "Alberto").sorted().findFirst().ifPresent(System.out::println);

        Stream.of("Ava", "Aneri", "Alberto", "Sava").filter(x->x.startsWith("A")).sorted().forEach(System.out::println);
        Arrays.stream(new int[] {2, 4, 6, 8, 10}).map(x->x*x).average().ifPresent(System.out::println);

        List<String> people = Arrays.asList("Al", "Ankit", "AAA", "FCXSC", "cdcsdcsdc");

        people.stream().map(String::toLowerCase).filter(x->x.startsWith("a")).forEach(System.out::println);

        System.out.println("---");
        System.out.println("---");
        Stream<String> rows3= Files.lines(Paths.get("C:\\PROIECTE_JAVA\\design_pattersn\\problems\\src\\streamspractice\\data.txt"));
        Map<String, Integer> map= new HashMap<>();
        map = rows3
                .map(x->x.split(","))
                .filter(x->x.length == 3)
                .filter(x-> Integer.parseInt(x[1])>15)
                .collect(Collectors.toMap(
                        x->x[0],
                        x->Integer.parseInt(x[1])));
        rows3.close();
        for(String key: map.keySet()) {
            System.out.println(key+ " "+map.get(key));
        }

        double total = Stream.of(7.3, 1.5, 4.8).reduce(0.0, (Double a, Double b)-> a+b);
        System.out.println("Total = "+ total);

        System.out.println("---");
        System.out.println("---");

       IntSummaryStatistics summary= IntStream.of(7, 2, 19, 88, 73, 4, 10).summaryStatistics();
       System.out.println(summary);
    }
}
