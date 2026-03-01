import java.net.*;
import java.io.*;
public class ReverseEchoServer extends Thread {
    Socket skt;
    ReverseEchoServer(Socket sk) {
        skt = sk;
    }
    public void run() {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            PrintStream ps = new PrintStream(skt.getOutputStream());

            String msg;
            StringBuilder sb;
            do{
                sb = new StringBuilder(br.readLine());
                sb.reverse();
                msg = sb.toString();
                ps.println(msg);
            }while (!msg.equals("dne"));
            skt.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(2000);
        Socket skt;
        ReverseEchoServer res;
        int count = 0;
        do{
            skt = ss.accept();
            res = new ReverseEchoServer(skt);
            count++;
            System.out.println("Connected to the server. Client: " + count);
            res.start();
        }while(true);

    }


}
