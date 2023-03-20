package Networking.Datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServerSide {
    public static void main(String[] args) throws Exception {

        DatagramSocket ds=new DatagramSocket(2000);
        byte[] b=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b,1024);
        ds.receive(dp);

        String msg=new String(dp.getData()).trim();
        System.out.println("From Client: "+msg);
        StringBuilder sb=new StringBuilder(msg);
        msg=sb.reverse().toString();

        dp=new DatagramPacket(b,msg.length(), InetAddress.getByName("localhost"),2001);
        ds.send(dp);

        ds.close();

    }
}
