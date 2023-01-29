package Final;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UDPServer {
    public static void main(String[] args) throws Exception
    {
        var ds=new DatagramSocket(2334);
        byte[] buff=new byte[1024];
        System.out.println("UDP SERVER STARTED");
        //DatagramPacket dpreceive=null;
        while(true){
            var dpreceive=new DatagramPacket(buff,buff.length);
            ds.receive(dpreceive);
            String str=new String(dpreceive.getData(),0,dpreceive.getLength());
           var rev= IntStream.range(0, str.length()).
                    boxed().
                    sorted(Collections.reverseOrder()).
                    map(i -> String.valueOf(str.charAt(i))).
                    collect(Collectors.joining());
            System.out.println("Client Messaged--> "+rev);
            if(str.equals("bye"))
            {
                System.out.println("Server Is Exiting .... BYE");
                break;
            }
            buff=new byte[1024];
        }

    }
}
