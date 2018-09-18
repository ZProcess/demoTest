package com;



import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UdpTransport {

     private static final int DATA_SIZE=512; //数据长的
     private static final int DATA_BUFFER=1024;
     private byte[] temp;//用于组装数据
     private byte[] data;
     private byte[] buffer;
     private DatagramPacket datagramPacket;
    UdpTransport(){
        data=new byte[DATA_SIZE];
        buffer=new byte[DATA_BUFFER];
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
    public byte[] assemblePackage(byte[]...temp) throws UnsupportedEncodingException {
        int numb=temp.length;
        int len=0;
        for(int i=0;i<numb;i++){
            System.arraycopy(temp[i],0,buffer,len,temp[i].length);
            len+=temp[i].length;
        }
        byte[] result=Arrays.copyOf(buffer,len-1);
        return result;
    }
}
