package Final;


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
    private byte[] buf = new byte[256];

    public Vps_server() throws SocketException {
        socket=new DatagramSocket(port);
    }

    @Override
    public void run() {
        isRunning=true;
        while (isRunning)
        {

        }


    }
}
