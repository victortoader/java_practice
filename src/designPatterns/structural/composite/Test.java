package designPatterns.structural.composite;

// When we need to create a structure in a way that the objects in the structure has to be treated the same way, we can apply composite design pattern.
//
//Lets understand it with a real life example – A diagram is a structure that consists of Objects such as Circle, Lines, Triangle etc. When we fill the drawing with color (say Red),
// the same color also gets applied to the Objects in the drawing. Here drawing is made up of different parts and they all have same operations.

public class Test {

    public static void main(String [] args) {
        Shape tri=new Triangle();
        Shape tri1=new Triangle();
        Shape cir=new Circle();

        Drawing drawing=new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);
        drawing.add(cir);

        drawing.draw("Red");
        drawing.clear();
        drawing.draw("Green");
    }
}
