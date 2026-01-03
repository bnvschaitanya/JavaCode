class Super{
    String name = "Supper";
    public void method1(){
        System.out.println("Super Constructor");
    }
    public void method2(){
        System.out.println("Super Method 2");
    }
    public Super(){
        System.out.println("Super Method");
    }
}
class Child extends Super{
    String name = "Child";
    public Child(){
        System.out.println("Child Constructor");
    }
    @Override
    public void method2(){
        System.out.println("Child Method 2");
    }
    public void method3(){
        System.out.println("Child Method 3");
    }
}
public class Overrding {
    public static void main(String[] args) {
        Super child = new Super();
        child.method2();
    }
}