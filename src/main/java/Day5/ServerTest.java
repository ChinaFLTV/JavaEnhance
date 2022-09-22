package Day5;

/*
 ** @author LiGuanda
 ** @date  PM 3:41:45
 ** @description This is a description of ServerTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * @author Lenovo
 */
public class ServerTest {


    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(3367);
        Socket incoming = serverSocket.accept();
        Scanner scanner = new Scanner(incoming.getInputStream(), StandardCharsets.UTF_8);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(incoming.getOutputStream(), StandardCharsets.UTF_8), true);
        out.println("hello !");
        while (scanner.hasNextLine()) {

            System.out.println("收到来自客户端的消息："+scanner.nextLine());

        }
        System.out.println("-----------START-----------");
        while(true){

            System.out.println("-----------START0-----------");
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("-----------START1-----------");
            out.write(scanner1.nextLine());

            System.out.println("-----------START2-----------");
            out.flush();

            System.out.println("正在发送...");

        }




    }


}
