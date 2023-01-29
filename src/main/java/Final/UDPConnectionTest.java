package Final;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.net.SocketException;
import java.net.UnknownHostException;


public class UDPConnectionTest {
    private Vps_Client client;

    @BeforeEach
    public void startUp() throws SocketException, UnknownHostException {
        new Vps_server().run();
        client=new Vps_Client();
    }

}
