package com;

import java.io.IOException;
import java.net.*;

public class UdpSend {

    public static void main(String[] args) throws IOException {

        System.out.println("���ͷ�����.....");

        //1:���� Socket�˵㣬ʵ�����ݵķ���
        DatagramSocket socket  = new DatagramSocket();//��ȷ��Э��

        //2:��ȷҪ���͵�����
        String ss ="����ż�";
        byte[] data = ss.getBytes();

        //3:��Ҫ���͵����ݴ�����ݱ���
        //���ݱ���ָ���˷��͵����ݣ��������ݵ�������Ip��ַ���󣬽������ݵ�����ʹ���ĸ��˿ڽ���
        DatagramPacket dp = new DatagramPacket(data,data.length, InetAddress.getByName("172.16.55.255"), 22222);

        //4:ʹ�� Socket�ķ��͹��ܷ�������
        //�������ݾ���������������ݣ������ڲ�ʹ���������
        socket.send(dp);

        socket.close();
    }
}
