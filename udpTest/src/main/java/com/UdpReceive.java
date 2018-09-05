package com;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpReceive {

    public static void main(String[] args) throws IOException {

        System.out.println("���շ�����.....");

        //1:����Socket�˵㣬ʵ�����ݵĽ���
        DatagramSocket socket = new DatagramSocket(22222);

        //2:������һ���յ����ݱ���������������
        byte[] arr = new byte[1024];
        DatagramPacket packet = new DatagramPacket(arr, arr.length);

        //3:ʹ�� Socket�Ľ��չ��ܽ�������
        //�������ݾ��Ǵ������ȡ����
        socket.receive(packet);

        //�������յ�����
        //��������
        byte[]  data = packet.getData();//�õ����յ�����
        String shuju = new String(data,0,packet.getLength());

        //�õ����ͷ���ip��ַ
        InetAddress address = packet.getAddress();
        String ip = address.getHostAddress();

        //�õ����ͷ���������ʹ�õĶ˿�
        int port = packet.getPort();

        System.out.println(ip+":"+port+":"+shuju);

        socket.close();


    }

}
