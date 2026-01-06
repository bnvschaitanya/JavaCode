public class mythreadTest2 extends Thread {
    public void run() {
        int i  = 0;
        while (i<100) {
            System.out.println(++i + "Hello ");
        }
    }
    public static void main(String[] args) {
        mythreadTest2 t1 = new mythreadTest2();
        t1.start();
        int i =0;
        while (i<100) {
            System.out.println(++i + "World ");
        }
    }
}
