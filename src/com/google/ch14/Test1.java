package com.google.ch14;

import com.google.I;

import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.LongAdder;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
          ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
//        ConcurrentHashMap<String, LongAdder> concurrentHashMap = new ConcurrentHashMap<>();
//        concurrentHashMap.put("Tom",new LongAdder());

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable r = ()-> {
//            concurrentHashMap.put("Tom", concurrentHashMap.get("Tom")+1);
//            concurrentHashMap.putIfAbsent("Tom", new LongAdder()).increment();
              concurrentHashMap.merge("Tom",1, Integer::sum);

        };


        for (int i = 0; i < 10000; i++) {
            executorService.execute(r);
        }

        Thread.sleep(3000);
        executorService.shutdown();

        System.out.println(concurrentHashMap.get("Tom"));
    }

}
