package numberOfAnimals;

import java.util.HashSet;
import java.util.Set;

public class Question {
    public static void main(String[] args) {
        Animal lion1=new Animal(1, "lion");
        Animal lion2=new Animal(1, "lion");
        Set<Animal> animals=new HashSet<>();
        animals.add(lion1);
        animals.add(lion2);
        System.out.println("Number of animals" + animals.size());

        System.out.println(lion1.equals(lion2));
    }

}
