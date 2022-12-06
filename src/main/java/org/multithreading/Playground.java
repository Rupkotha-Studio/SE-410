package org.multithreading;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
class Server{
    public static void getConnection() throws IOException, ClassNotFoundException {
        var server=new ServerSocket(3030);
        System.out.println("Server Running On: "+server.getLocalPort());
        while (true)
        {
            var accept = server.accept();
            System.out.println("Connection accepted");
            var ous=new ObjectOutputStream(accept.getOutputStream());
            var ois=new ObjectInputStream(accept.getInputStream());

            var cMsg=ois.readObject()
                    .toString()
                    .toUpperCase();
            System.out.println("From Client: "+cMsg);

             ous.writeObject("This is Rust Developer: ");

        }

    }

}
class Client{
    public static void getClient() throws IOException, ClassNotFoundException {
        System.out.println("Client getting....");
        var client=new Socket("127.0.0.1",3030);
        System.out.println("Client Connected");
        var ois=new ObjectInputStream(client.getInputStream());
        var ous=new ObjectOutputStream(client.getOutputStream());
        var Scanner=new java.util.Scanner(System.in);
        //From client
        ous.writeObject(Scanner.nextLine());
        //From Server
        System.out.println("From Server: "+ois.readObject().toString().toUpperCase());
    }
}
public class Playground {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       // Connection();
        new Thread(()->{
            try {
                Server.getConnection();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }).start();
        System.out.println("-------------------------------------");
        new Thread(()->{
            try {
                Client.getClient();
            } catch (IOException | ClassNotFoundException e) {
               e.printStackTrace();
            }
        }).start();



    }
}
