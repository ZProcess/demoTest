package com;

import java.io.UnsupportedEncodingException;
import java.net.SocketException;

public class TftpServer {
    private static final int PORT=69;
    public static void main(String[] args) throws SocketException, UnsupportedEncodingException {
        UdpServer udpServer=new UdpServer(PORT);
        byte[] b1=new byte[2];
        b1[1]=1;
        byte[] b2="haha".getBytes("utf-8");
        UdpTransport udpTransport=new UdpTransport();
        udpTransport.assemblePackage(b1,b2);

    }

}
