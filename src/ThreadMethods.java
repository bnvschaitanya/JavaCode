import java.util.Scanner;

public class ThreadMethods extends Thread{
    public void run(){
        int i = 1;
        while(i<100){
            System.out.println("Calling Thread 1 - "+i++);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
    ThreadMethods(String name){
        super(name);
    }
    void ThreadDetails(ThreadMethods t){
        System.out.println("############ ThreadDetails ##############");
        System.out.println("Thread Name - "+t.getName());
        System.out.println("Thread ID - "+t.getId());
        System.out.println("Thread Priority - "+t.getPriority());
        System.out.println("Thread State - "+t.getState());
    }
    void SetThreadDetails(ThreadMethods t){
        System.out.println("############ SetThreadDetails ##############");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Thread Name");
        String name = sc.nextLine();
        System.out.println("Enter Thread Priority");
        int priority = sc.nextInt();
        t.setName(name);
        t.setPriority(priority);
    }
    public static void main(String[] args) throws Exception{
        ThreadMethods t1 = new ThreadMethods("t1");
        Thread t2 = Thread.currentThread();
        t1.start();
        t2.yield();
        int i  = 1;
        while(i<100){
            System.out.println("Calling Main Thread - "+i++);
        }

    }
}
