class SharedObject1{
    void display(String name){
        synchronized (this) {
            for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i));
            }
        }
    }
}
class Thread1 extends Thread{
    SharedObject1 s1;
    Thread1(SharedObject1 s1){
        this.s1=s1;
    }
    public void run(){
        s1.display("Welcome Buddy");
    }
}

class Thread2 extends Thread{
    SharedObject1 s1;
    Thread2(SharedObject1 s1){
        this.s1=s1;
    }
    public void run(){
        s1.display("Winter is Coming");
    }
}
public class SynchronizedMethod {
    public static void main(String[] args) {
        SharedObject1 s1 = new SharedObject1();
        Thread1 t1 = new Thread1(s1);
        Thread2 t2 = new Thread2(s1);
        t1.start();
        t2.start();
    }
}
