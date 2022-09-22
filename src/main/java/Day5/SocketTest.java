package Day5;

/*
 ** @author LiGuanda
 ** @date  PM 3:13:00
 ** @description This is a description of SocketTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author Lenovo
 */
public class SocketTest {


    public static void main(String[] args) {

        try {

            Socket socket = new Socket("time-a.nist.gov", 13);
            socket.setSoTimeout(5000);
            Scanner in = new Scanner(socket.getInputStream(), StandardCharsets.UTF_8);
            while (in.hasNextLine()) {

                System.out.println(in.nextLine());

            }
            Socket socket1 = new Socket();
            socket1.connect(new InetSocketAddress("www.baidu.com", 80), 5000);
            System.out.println(socket1.isConnected());
            InetAddress inetAddress = InetAddress.getByName("www.baidu.com");
            System.out.println(inetAddress);
            InetAddress inetAddress1 = InetAddress.getLocalHost();
            System.out.println(inetAddress1);
            InetAddress inetAddress2 = InetAddress.getLoopbackAddress();
            System.out.println(inetAddress2);
            String hostName = InetAddress.getByName("www.tencent.com").getHostName();
            System.out.println(hostName);


        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }


}
