import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class DatagramServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(2000);
        DatagramPacket packet = new DatagramPacket(new byte[1024], 1024);
        socket.receive(packet);

        String msg = new String(packet.getData()).trim();
        StringBuilder sb = new StringBuilder(msg);
        msg = sb.reverse().toString();
        System.out.println("Server Response: " + msg);
        packet = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("localhost"), 2001);
        socket.send(packet);

        socket.close();

    }
}
