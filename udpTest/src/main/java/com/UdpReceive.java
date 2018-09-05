package com;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpReceive {

    public static void main(String[] args) throws IOException {

        System.out.println("接收方启动.....");

        //1:创建Socket端点，实现数据的接收
        DatagramSocket socket = new DatagramSocket(22222);

        //2:创建了一个空的数据报包用来接收数据
        byte[] arr = new byte[1024];
        DatagramPacket packet = new DatagramPacket(arr, arr.length);

        //3:使用 Socket的接收功能接收数据
        //接收数据就是从网络读取数据
        socket.receive(packet);

        //解析接收的数据
        //解析数据
        byte[]  data = packet.getData();//得到接收的数据
        String shuju = new String(data,0,packet.getLength());

        //得到发送方的ip地址
        InetAddress address = packet.getAddress();
        String ip = address.getHostAddress();

        //得到发送方发送数据使用的端口
        int port = packet.getPort();

        System.out.println(ip+":"+port+":"+shuju);

        socket.close();


    }

}
