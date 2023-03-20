package Networking.TCPWithMultithreading;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide extends Thread {
    Socket stk;

    public ServerSide(Socket sc){
        stk=sc;
    }


    public void run(){
        try{
        BufferedReader bff = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream());

        String msg = "";
        StringBuilder sb;

        while (!msg.equals("dne")) {
            msg = bff.readLine();
            sb = new StringBuilder(msg);
            sb.reverse();
            msg = sb.toString();
            stk.close();
        }}catch (Exception e){}

    }



    public static void main(String[] args) throws Exception {
        while (true) {
            ServerSocket st = new ServerSocket(2000);
            Socket sc;
            ServerSide ss;
            int count=1;
            while (true) {
                sc = st.accept();
                System.out.println("Client connected: "+count++);
                ss=new ServerSide(sc);
                ss.start();
            }

        }
    }
}
