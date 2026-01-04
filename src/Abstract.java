abstract class SuperClass{
    public SuperClass(){
        System.out.println("Super Constructor");
    }
    public void method1(){
        System.out.println("Super method1");
    }
    abstract void method2();
}
class SubClass extends SuperClass{
    public SubClass(){
        System.out.println("Sub Constructor");
    }
    @Override
    public void method2(){
        System.out.println("Sub method2");
    }
}
public class Abstract {
    public static void main(String[] args) {
        SuperClass child = new SubClass();
        child.method1();
        child.method2();
    }
}
