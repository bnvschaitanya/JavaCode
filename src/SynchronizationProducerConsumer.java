class sharedData{
    int val = 0;
    boolean flag = true;
    synchronized void setval(int val){
        while(flag!=true){
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        this.val = val;
        flag = false;
        notify();
    }
    synchronized int getval(){
        int x;
        while(flag != false){
            try {
                wait();
            } catch (InterruptedException e) {}
        }
        x = this.val;
        flag = true;
        notify();
        return x;
    }
}
class producer extends Thread{
    sharedData data;
    producer(sharedData data){
        this.data = data;
    }
    public void run(){
        int x = 0;
        while(x<10){
            System.out.println("Producer sets val:" + ++x);
            data.setval(x);
        }
    }
}
class consumer extends Thread{
    sharedData data;
    consumer(sharedData data){
        this.data = data;
    }
    public void run(){
        while(true){
            System.out.println("Consumer gets val:" + data.getval());
        }
    }
}
public class SynchronizationProducerConsumer {
    public static void main(String[] args){
        sharedData data = new sharedData();
        producer producer = new producer(data);
        consumer consumer = new consumer(data);
        producer.start();
        consumer.start();
    }
}
