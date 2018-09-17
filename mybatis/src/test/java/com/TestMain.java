package com;

public class TestMain {
    public static void main(String[] args) {
        String mac = "abcd";
        mac = mac.toUpperCase();
        String reg = "(.{2})";
        mac = mac.replaceAll(reg, "$1:");
        int last = mac.lastIndexOf(":");
        mac = mac.substring(0, last);
        System.out.println(mac);
    }

}