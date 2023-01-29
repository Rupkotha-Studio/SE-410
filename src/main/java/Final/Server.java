package Final;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
    private static final int port=8989;
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        System.out.println("Server Started at port: "+port);
        clientSocket = serverSocket.accept();
        System.out.println("Client Accepted");
    }
    public void getTimeDateInfoFromServer(int port) throws IOException {
        start(port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String greeting = in.readLine();
        if ("give me date time".equals(greeting))
            out.println(new Date().toString());
        else
            out.println("unrecognised greeting");
    }

    public static void main(String[] args) throws IOException {
        new Server().getTimeDateInfoFromServer(port);
    }
}
