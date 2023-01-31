package Final;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_Server_16 {

    public UDP_Server_16() throws IOException {
        startServer();
    }
    void startServer() throws IOException {
        var serverSocket =
                new DatagramSocket(9876);

        byte[] receiveData = new byte[1024];
        byte[] sendData;

        while(true)
        {
            var receivePacket = new DatagramPacket(receiveData, receiveData.length);

            serverSocket.receive(receivePacket);

            String sentence = new String(receivePacket.getData(),
                    0, receivePacket.getLength());

            var IPAddress = receivePacket.getAddress();

            int port = receivePacket.getPort();

            var arr=sentence.toCharArray();
            int sum=0;
            for (int i = 0; i < arr.length; i++) {
                var value=Integer.parseInt(String.valueOf(arr[i]));
                sum+=value;
            }

            sendData =String.valueOf(sum).getBytes();

            DatagramPacket sendPacket =
                    new DatagramPacket(sendData, sendData.length,
                            IPAddress, port);

            serverSocket.send(sendPacket);
        }
    }

    public static void main(String[] args) throws IOException {
        new UDP_Server_16();
    }
}
