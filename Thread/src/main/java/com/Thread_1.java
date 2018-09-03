package com;

public class Thread_1 extends Thread{
    private  static int i=1;
    @Override
    public void run() {
        synchronized (Thread_1.class) {
            while (true) {
                try {
                    System.out.println("start Thread: " + i + Thread.currentThread().getName());
                    i++;
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
