package com;

import java.io.IOException;
import java.net.*;

public class UdpSend {

    public static void main(String[] args) throws IOException {

        System.out.println("发送方启动.....");

        //1:创建 Socket端点，实现数据的发送
        DatagramSocket socket  = new DatagramSocket();//明确了协议

        //2:明确要发送的数据
        String ss ="明天放假";
        byte[] data = ss.getBytes();

        //3:把要发送的数据打成数据报包
        //数据报包指明了发送的数据，接收数据的主机的Ip地址对象，接收数据的主机使用哪个端口接收
        DatagramPacket dp = new DatagramPacket(data,data.length, InetAddress.getByName("172.16.55.255"), 22222);

        //4:使用 Socket的发送功能发送数据
        //发送数据就是向网络输出数据，所以内部使用了输出流
        socket.send(dp);

        socket.close();
    }
}
