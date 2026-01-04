final class finalClassA{
    final int a ;
    {
        a = 3;
    }
    finalClassA(){
        System.out.println("finalClassA Constructor");
    }
    final void finalDisplay(){
        System.out.println("Final Display Method");
    }
}
public class FinalClass {
    public static void main(String[] args) {
        finalClassA obj = new finalClassA();
        System.out.println("FinalClassA" + obj.a);

    }
}
