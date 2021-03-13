package java8features.interfaces;

public interface A {

    public default String calc() {
        return "calc";
    }
}
