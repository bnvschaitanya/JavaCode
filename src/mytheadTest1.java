class mythread extends Thread{
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i++ + "Hello ");
        }
    }
}
public class mytheadTest1 {
    public static void main(String args[]){
        mythread t = new mythread();
        t.start();
        int i =1;
        while(true){
            System.out.println(i++ + "World ");
        }
    }
}
