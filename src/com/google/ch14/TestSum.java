package com.google.ch14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSum {
    private static Test test = new Test();
    private static ThreadLocal<Test> threadLocal
            =ThreadLocal.withInitial(()->new Test());

    public static void main(String[] args) throws InterruptedException {
        ExecutorService  executor = Executors.newFixedThreadPool(10);

           for(int k = 0; k<100; k++){
               Runnable r = ()->{
                   test.inc();
               };
               executor.execute(r);
           }
           executor.shutdown();
           Thread.sleep(1000);
           //System.out.print(test.get());
        System.out.print(threadLocal.get().get());
    }

}
