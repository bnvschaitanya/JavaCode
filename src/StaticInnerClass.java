class StaticOuter{
    int x = 4;
    static int y =3;
    static class staticInner{
        int z = y;
        void StaticInnerDisplay(){
            System.out.println("Static Inner Class");
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        StaticOuter.staticInner i = new StaticOuter.staticInner();
        i.StaticInnerDisplay();
    }
}
