package com;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.util.ArrayList;
import java.util.List;

public class UdpTransport {

     private static final int DATA_SIZE=512; //数据长的
     private byte[] temp;//用于组装数据
     private byte[] data;
     private byte[] buffer;
     private DatagramPacket datagramPacket;
    UdpTransport(){
        data=new byte[DATA_SIZE];

    }
    public void sendRRQ(){

    }
    public void sendWRQ(){

    }

    public void sendData(){

    }

    public void sendError(){

    }
    public void sendAck(){

    }
    public void assemblePackage(String...temp) throws UnsupportedEncodingException {

    }

}
