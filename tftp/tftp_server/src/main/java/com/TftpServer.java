package com;

import java.io.UnsupportedEncodingException;
import java.net.SocketException;
import java.util.Arrays;

public class TftpServer {
    private static final int PORT=69;
    public static void main(String[] args) throws SocketException {
        int a=300;
        byte[] b=new byte[4];
        b[0]=(byte)a;
        b[1]=(byte)(a>>8);
        b[2]=(byte)(a>>16);
        b[3]=(byte)(a>>24);
        System.out.println(Arrays.toString(b));

        int[] c=new int[4];
        c[0]=(int)b[0];
        c[1]=(int)b[1]<<8;
        c[2]=(int)b[2]<<16;
        c[3]=(int)b[3]<<32;
        int r=c[0]+c[1]+c[2]+c[3];
        System.out.println(r);

    }

}
