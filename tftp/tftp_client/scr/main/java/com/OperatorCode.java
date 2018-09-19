package com;

public enum OperatorCode {
    RRQ(1),WRQ(2),DATA(3),ACK(4),ERROR(5);
    private int value;
    OperatorCode(int value){
        this.value=value;
    }
    public int getValue() {
        return value;
    }
}
