package Day5;

/*
 ** @author LiGuanda
 ** @date  PM 3:48:39
 ** @description This is a description of ClientTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author Lenovo
 */
public class ClientTest {


    public static void main(String[] args) {

        try {

            //System.out.println(InetAddress.getLocalHost().getHostAddress());
            Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 3367);
            Scanner scanner = new Scanner(socket.getInputStream(), StandardCharsets.UTF_8);
            while (scanner.hasNextLine()) {

                System.out.println("收到来自服务端的消息：" + scanner.nextLine());

            }
            Scanner scanner1 = new Scanner(System.in);
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
            out.println("heiheihei");

            if (scanner1.hasNextLine()) {

                out.write(scanner1.nextLine());
                out.flush();

            }


        } catch (UnknownHostException e) {

            throw new RuntimeException(e);

        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }


}
