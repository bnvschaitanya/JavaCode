import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class DatagramClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(2000);
        String msg = new String("Hello World");
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"), 2001   );
        socket.send(packet);
        System.out.println("Client msg: " + msg);

        byte[] b = new byte[1024];
        packet = new DatagramPacket(b, b.length);
        socket.receive(packet);
        msg =  new String(packet.getData()).trim();
        System.out.println("Server Response: " + msg);
        socket.close();

    }
}
