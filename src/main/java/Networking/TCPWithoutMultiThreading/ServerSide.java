package Networking.TCPWithoutMultiThreading;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide   {

    public static void main(String [] args) throws Exception {
        while (true)  {
            ServerSocket st = new ServerSocket(2000);
            Socket sc = st.accept();
            BufferedReader bff = new BufferedReader(new InputStreamReader(sc.getInputStream()));
            PrintStream ps = new PrintStream(sc.getOutputStream());

            String msg = "";
            StringBuilder sb;

            while (!msg.equals("dne")) {
                msg = bff.readLine();
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();
            }

        }
    }

}
