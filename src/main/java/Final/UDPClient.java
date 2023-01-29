package Final;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient {
    public static void main(String[] args) throws Exception
    {

        var ds=new DatagramSocket();
        var scan=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your message:");
            String str=scan.nextLine();
            var ip= InetAddress.getByName("localhost");
            var dp=new DatagramPacket(str.getBytes(),str.length(),ip,2334);
            ds.send(dp);
            if(str.equals("Quit"))
            {
                ds.close();
                break;
            }

        }
    }
}
