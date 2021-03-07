package java8features.streams;

import java.util.ArrayList;
import java.util.List;

public class H {

    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();

        for (int i=1; i<=100; i++) {
            values.add(i);
        }
        values.stream().forEach(System.out::println);
        values.parallelStream().forEach(System.out::println);

    }
}
