import java.lang.reflect.Parameter;
import java.util.Scanner;
import java.lang.*;
import java.lang.reflect.*;
class PracticeSession0 {
    public void Bitmasking(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first byte number: ");
        int b1 = sc.nextInt();
        System.out.print("Enter second byte number: ");
        int b2 = sc.nextInt();

        byte b3 = (byte)(b1<< 4);
        b3 = (byte)(b3|b2);

        System.out.println("Combined Number: " + b3 + " -> Bytes:" + Integer.toBinaryString(b3) );
        System.out.println("First Byte Number: " + (b3 & 0b1111000));
        System.out.println("Second Byte Number: " + (b3 & 0b00001111));

    }
}
public class PracticeSession1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PracticeSession0 ps = new PracticeSession0();
        Class c = PracticeSession1.class;
        Field f[] = c.getFields();
        Class cc[] =  c.getClasses();
        ps.Bitmasking();

    }
}
