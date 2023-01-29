package Final;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Write a UDP Client-Server program in which the Client sends any string and Server
 * responds with Reverse string
 */
public class Vps_server implements Runnable{
    private static final int port =8899;
    private DatagramSocket socket;
    private boolean isRunning;
    private byte[] buffer = new byte[256];

    public Vps_server() throws SocketException {
        socket=new DatagramSocket(port);
    }

    @Override
    public void run() {
        isRunning=true;
        while (isRunning)
        {
            var packet=new DatagramPacket(buffer, buffer.length);
            try {
                socket.receive(packet);
                var address = packet.getAddress();
                var port = packet.getPort();
                packet = new DatagramPacket(buffer, buffer.length, address, port);
                var received= new String(packet.getData(),0, packet.getLength());
                if (received.equals("end")) {
                    isRunning = false;
                    continue;
                }
                socket.send(packet);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        socket.close();
    }
}
