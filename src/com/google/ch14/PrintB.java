package com.google.ch14;

public class PrintB implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i<5; i++) {
            Thread.yield();
            //通知cpu该线程可以让出CPU给其它线程执行
            System.out.printf("%-3s", "B");
        }
    }
}
