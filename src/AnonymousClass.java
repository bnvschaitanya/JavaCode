abstract class AnonymousOuter {
    abstract void phoneDisplay();
}
public class AnonymousClass {
    public static void main(String[] args) {
        AnonymousOuter i = new AnonymousOuter() {
            @Override
            void phoneDisplay() {
                System.out.println("Call feature of phone");
            }
        };
        i.phoneDisplay();
    }
}
