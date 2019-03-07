package com.google.ch14;

public class PrintNum implements Runnable {
    @Override
    public void run() {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.printf("%-3d", 0);
            }
        });
        thread.start();
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
             System.out.printf("%-3d", 1);
        }//只要5个0打印完毕后，还剩下2个1，就是对的
    }
}
