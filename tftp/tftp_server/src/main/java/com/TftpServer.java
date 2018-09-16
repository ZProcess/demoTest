package com;

import java.io.UnsupportedEncodingException;
import java.net.SocketException;

public class TftpServer {
    private static final int PORT=69;
    public static void main(String[] args) throws SocketException, UnsupportedEncodingException {
        UdpServer udpServer=new UdpServer(PORT);
        UdpTransport udpTransport=new UdpTransport();

    }

}
