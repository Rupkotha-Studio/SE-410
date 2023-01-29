package Final;


import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Vps_Client {
    private DatagramSocket socket;
    private InetAddress address;
    private byte[] buffer;
    private static final int port=8899;
    public Vps_Client() throws SocketException, UnknownHostException {
        socket = new DatagramSocket();
        address = InetAddress.getByName("localhost");
    }
    public String sendMail(String compose) throws IOException {
        buffer=compose.getBytes(StandardCharsets.UTF_8);
        var packet= new DatagramPacket(buffer, buffer.length, address,port );
        socket.send(packet);
        packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);
        var received = new String(
                packet.getData(), 0, packet.getLength());
        return received;
    }
}
