package com;

import java.io.UnsupportedEncodingException;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Scanner;

public class TftpClient{
    private static final int PORT=69;
    private UdpTransport udpTransport;
    private UdpServer udpServer;
    TftpClient() throws SocketException {
        udpServer=new UdpServer(PORT);
        udpTransport=new UdpTransport();
    }
    public static void main(String[] args) throws SocketException {
        TftpClient tftpClient=new TftpClient();
        Scanner sc=new Scanner(System.in);
        System.out.println("1.read 2.write 3.quit");
        int code=sc.nextInt();
        switch (code){
            case 1:
                System.out.println("your fileName：");
                String fileName=sc.next();
                tftpClient.udpTransport.sendRRQ(1,sc.nextLine());
                break;
            case 2:
                System.out.println("your fileName：");
            case 3:
        }
    }

}
