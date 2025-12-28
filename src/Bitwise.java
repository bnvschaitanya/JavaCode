import java.util.Scanner;

public class Bitwise {
    private static void swap() {
        System.out.print("Enter the a and b values: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.print(String.format("a: %d, b: %d", a, b));
    }
    private static void bitMerge(int a, int b){
        byte c = (byte)a;
        c = (byte) ((c << 4) | b);
        //Merge 2 values into one byte.
        System.out.println(String.format("a: %s, b: %s, c: %s", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c & 0xFF)));
        //Retrive those 2 values from a byte.
        System.out.println("Value of a:" + ((c & 0b11110000) >> 4) + " Value of b:" + (b & 0b00001111));
    }
    public static void main(String[] args) {
//        swap();
    bitMerge(9,12);
    }
}


