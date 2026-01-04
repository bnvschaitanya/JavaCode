class OuterLocal{
    int x = 4;
    void phoneDisplay(){
        System.out.println("phone display");
        int y = 5;
        class InnerDisplay{
            void Display(){
                System.out.println("phone display");
            }
        }
        InnerDisplay innerDisplay = new InnerDisplay();
        innerDisplay.Display();
    }
}
public class LocalInnerClass {
 public static void main(String[] args) {
    OuterLocal phone = new OuterLocal();
    phone.phoneDisplay();
 }
}
