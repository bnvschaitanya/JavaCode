import java.net.*;
import java.io.*;

public class ReverseEchoClient {
    public static void main(String[] args) throws IOException {
        Socket skt = new Socket("localhost", 2000);
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(skt.getInputStream()));
        PrintStream ps = new PrintStream(skt.getOutputStream());

        String msg;
        do{
            msg = keyboard.readLine();
            ps.println(msg);
            msg  = br.readLine();
            System.out.println("Server Response: " + msg);
        }while(!msg.equals("dne"));
        skt.close();

    }
}
