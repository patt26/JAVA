package Networking.TCPWithoutMultiThreading;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientSide {

    public static void main(String[] args) throws Exception {

        Socket sc = new Socket("localhost", 2000);
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(sc.getInputStream()));
        PrintStream pr = new PrintStream(sc.getOutputStream());

        String msg="";
        while (!msg.equals("dne")) {
            msg = keyboard.readLine();
            pr.println(msg);
            msg = br.readLine();
            System.out.println("Message from server: " + msg);

        }
    }
}
