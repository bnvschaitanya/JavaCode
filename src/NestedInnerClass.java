class OuterClass {
    int x = 5;
    InnerClass inner = new InnerClass();
    class InnerClass {
        int y = 10;
        void Display(){
            System.out.println("Inner Class");
        }
    }
    void OutterDisplay(){
        System.out.println("Outer Class");
        System.out.println(inner.y);
        inner.Display();
    }
}
public class NestedInnerClass {
    public static void main(String[] args) {
        System.out.println("Hello World");
        OuterClass.InnerClass inner = new OuterClass().new InnerClass();
        inner.Display();
        System.out.println(inner.y);
    }
}
