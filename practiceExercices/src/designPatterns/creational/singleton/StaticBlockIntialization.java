package designPatterns.creational.singleton;

import com.sun.jdi.event.ExceptionEvent;

public class StaticBlockIntialization {

    private static StaticBlockIntialization instance;
    private StaticBlockIntialization() {}

    static {
        try {
        } catch ( Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }

    }


    public static StaticBlockIntialization getInstance() {
        return instance;
    }
}
