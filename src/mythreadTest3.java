class myrunnable implements Runnable{
    @Override
    public void run() {
        int i =0;
        while (i<100){
            System.out.println(++i + "Hello ");
        }
    }
}
public class mythreadTest3 {
    public static void main(String[] args) {
        myrunnable m = new myrunnable();
        Thread t = new Thread(m);
        t.start();
        int i =0;
        while (i<100){
            System.out.println(++i + "World ");
        }
    }
}
