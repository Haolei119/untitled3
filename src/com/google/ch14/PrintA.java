package com.google.ch14;

public class PrintA implements Runnable {
    @Override
    public void run() {
            try {
                for (int i = 0; i < 5; i++) {
                    Thread.sleep(1000);
                    //当前线程休眠xxx时间，单位是毫秒
                    //1秒=1000毫秒
                    System.out.printf("%-3s", "A");
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
