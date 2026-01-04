class CoffeMachine{
    private float waterQty;
    private float milkQty;
    private float coffePowderQty;
    static private CoffeMachine instance;
    private CoffeMachine(){
        waterQty = 1;
        milkQty = 1;
        coffePowderQty = 1;
    }
    public static CoffeMachine getCoffeMachine(){
        if (instance == null){
            instance = new CoffeMachine();
        }
        return instance;
    }

}
public class SingletonClass {
    public static void main(String[] args) {
        System.out.println("SingletonClass");
        CoffeMachine m1 = CoffeMachine.getCoffeMachine();
        CoffeMachine m2 = CoffeMachine.getCoffeMachine();
        CoffeMachine m3 = CoffeMachine.getCoffeMachine();
        System.out.println("m1: " + m1);
        System.out.println("m2: " + m2);
        System.out.println("m3: " + m3);
    }
}