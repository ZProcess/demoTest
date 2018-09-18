package com;

public enum ErrorCode {
    ERROR0(0,"Not defined,see error message(if any)."),
    ERROR1(1,"File not found."),
    ERROR2(2,"Access violation."),
    ERROR3(3,"Disk full or allocation exceeded."),
    ERROR4(4,"Illegal TFTP operation."),
    ERROR5(5,"Unknown transfer ID."),
    ERROR6(6,"File already exists."),
    ERROR7(7,"No Such user.");
    private int code;
    private String desc;

    ErrorCode(int code,String desc){
        this.code=code;
        this.desc=desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
