package java8features.consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


class ConsImpl implements Consumer {

    @Override
    public void accept(Object o) {

    }

    @Override
    public Consumer andThen(Consumer after) {
        return null;
    }
}

public class G {

    public static void main(String arg[]) {
        List<Integer> values = Arrays.asList(4, 5, 6, 7, 8);
//        Consumer<Integer> c = new Consumer<Integer>() {
//            @Override
//            public void accept(Integer i) {
//                System.out.println(i);
//
//            }
//        };
//        Consumer<Integer> c= (Integer i) -> System.out.println(i);

        values.forEach(i -> System.out.println(i));
    }


}
