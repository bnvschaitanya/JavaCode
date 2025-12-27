public class Operators {
    public static void main(String[] args) {
        long l = 10l;
        float f = 10.5f;
        float res = l + f;
        System.out.println("Long Size: " + Long.BYTES);
        System.out.println("Float Size: " + Float.BYTES);
        System.out.println(res);

        System.out.println("Result of Increment long and float : " + (++l + f+++1));
    }
}
