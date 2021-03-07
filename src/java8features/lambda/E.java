package java8features.lambda;

public class E {

    public static void main(String[] args) {
        D obj;
    //    obj=new F();
//        obj= new D() {
//
//
//            @Override
//            public void show() {
//                System.out.println("anonymous inner class implementation");
//            }
//        };

        obj= (i) -> System.out.println("a"+i);
        obj.show(14);


    }
}
