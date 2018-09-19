package com;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpServer {
    private DatagramSocket datagramSocket;
    private  UdpTransport udpTransport;
    UdpServer(int port) throws SocketException {
        datagramSocket=new DatagramSocket(port);

    }
}
