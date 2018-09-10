package com;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        String reg="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
        Scanner s=new Scanner(System.in);
        while (s.hasNext()){
            String r=s.next();
            boolean flag=r.matches(reg);
            System.out.println(flag);
        }



    }
}
