package numberOfAnimals;

import javax.print.attribute.standard.MediaSize;
import java.util.Objects;

public class Animal {

    private final int id;
    private final String name;

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Animal)) return false;
        Animal otherAnimal = (Animal)other;
        return id == otherAnimal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
