package java8features.foreach;

import java.util.Arrays;
import java.util.List;

public class C {

    public static void main(String arg[]) {
        List<Integer> values = Arrays.asList(4, 5, 6, 7, 8);
        values.forEach(i->System.out.println(i));


    }


}
