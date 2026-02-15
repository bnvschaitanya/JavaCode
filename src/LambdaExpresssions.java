@FunctionalInterface
interface mylambda{
    public void display();
}

class LambdaDemo{
    void display(mylambda ml){
        ml.display();
    }
}
public class LambdaExpresssions {
    public static void main(String [] args) {
//        mylambda m = () -> System.out.println("Hello World");
//          m.display();

//          mylambda m = (a,b)-> a+b;
//          System.out.println("Sum : " + m.display(12,13));

        LambdaDemo l = new LambdaDemo();
        l.display(()->System.out.println("Hello World"));

    }
}
