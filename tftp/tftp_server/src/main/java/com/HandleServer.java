package com;

public class HandleServer {

    public void dealRequest(byte[] pack) {
       int code=(int)pack[1];
       if(code==1){
           String fileName="";
            this.dealRRQ(fileName);
       }else if(code==2){
            this.dealWRQ();
       }else if(code==3){
            this.dealData();
       }else if(code==4){
            this.dealAck();
       }else if(code==5){
            this.dealError();
       }

    }

    public void dealRRQ(String fileName) {

    }

    public void dealWRQ() {

    }

    public void dealData() {

    }

    public void dealAck() {

    }

    public void dealError() {

    }

}
