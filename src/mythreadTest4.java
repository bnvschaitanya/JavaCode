public class mythreadTest4 implements Runnable {
    public void run() {
        int i =0;
        while(i<100){
            System.out.print(++i + "Hello ");
        }
    }
    public static void main(String[] args) {
        mythreadTest4 mythreadTest4 = new mythreadTest4();
        Thread t1 = new Thread(mythreadTest4);
        t1.start();
        int i = 0;
        while(i<100){
            System.out.println(++i + " Shinchan");
        }
    }
}
