class staticBlocksA{
    static int a=10;
    static void Display(){
        System.out.println("Static BlockA");
    }
    static {
        System.out.println("Static BlockB");
    }
}
public class StaticBlocks {
    public static void main(String[] args) {
        staticBlocksA a=new staticBlocksA();
        System.out.println("Main Block");
    }
}
