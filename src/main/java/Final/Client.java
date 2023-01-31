package Final;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private static final String  ip="127.0.0.1";
    private static final int port=8989;

    private void startConnection(String ip,int port) throws IOException {
        clientSocket = new Socket(ip,port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public String sendMessage(String msg) throws IOException {
        out.println(msg);
        String resp = in.readLine();
        return resp;
    }

    public static void main(String[] args) throws IOException {
        var client=new Client();
        client.startConnection(ip,port);
        var response=client.sendMessage("madam");
        System.out.println(response);
    }
}
