package Final;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Write a client-server program using UDP socket. Client send list of N numbers to server
 * and server respond the sum of N numbers.
 */

public class UDP_Client_16 {
    void startConnection() throws IOException {
        BufferedReader inFromUser =
                new BufferedReader(
                        new InputStreamReader(System.in));

        DatagramSocket clientSocket = new DatagramSocket();

        // Replace hostname with the FQDN of the server.

        var IPAddress = InetAddress.getByName("localhost");

        byte[] sendData;

        byte[] receiveData = new byte[1024];

        String sentence = inFromUser.readLine();

        sendData = sentence.getBytes();

        DatagramPacket sendPacket =
                new DatagramPacket(sendData, sendData.length,
                        IPAddress, 9876);

        clientSocket.send(sendPacket);

        DatagramPacket receivePacket =
                new DatagramPacket(receiveData, receiveData.length);

        clientSocket.receive(receivePacket);

        String modifiedSentence = new String(receivePacket.getData(),
                0, receivePacket.getLength());

        System.out.println("FROM SERVER: " + modifiedSentence);

        clientSocket.close();
    }

    public static void main(String[] args) throws IOException {
        new UDP_Client_16().startConnection();
    }
}
