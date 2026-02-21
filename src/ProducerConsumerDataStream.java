import java.io.*;

class Producer extends Thread {
    OutputStream os;
    Producer(OutputStream o) {
        os = o;
    }
    @Override
    public void run() {
        int count = 0;
        try {
            while(true) {
                System.out.println("Producer sends the data: " + count);
                os.write(count++);
                os.flush();
                Thread.sleep(100);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
class Consumer extends Thread {
    InputStream is;
    Consumer(InputStream is) {
        this.is = is;
    }
    @Override
    public void run() {
        try {
            while(true) {
                int data = is.read();
                System.out.println("Consumer received data: " + data);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
public class ProducerConsumerDataStream {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();
        pis.connect(pos);
        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);
        p.start();
        c.start();
    }
}
