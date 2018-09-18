package com;

import java.util.Arrays;

public class ChangeUtils {
    public static byte[] changeIntToByte(int numb){
        byte[] b=new byte[4];
        b[0]=(byte)numb;
        b[1]=(byte)(numb>>8);
        b[2]=(byte)(numb>>16);
        b[3]=(byte)(numb>>24);
        return b;
    }
    public static int changeByteToInt(byte[] b){
        int[] c=new int[4];
        c[0]=(int)b[0];
        c[1]=(int)b[1]<<8;
        c[2]=(int)b[2]<<16;
        c[3]=(int)b[3]<<32;
        int result=c[0]+c[1]+c[2]+c[3];
        return result;
    }
}
