package Networking.Datagram;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientSide {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket();
        String msg="Hello World";
        DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(), InetAddress.getByName("localhost"),2000);
        ds.send(dp);

        byte[] ar=new byte[1024];
        dp=new DatagramPacket(ar,1024);
        ds.receive(dp);
        msg=new String(dp.getData()).trim();
        System.out.println("From server side: "+msg);
    }
}
