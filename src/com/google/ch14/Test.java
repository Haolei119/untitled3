package com.google.ch14;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

public class Test  {
    //private LongAdder i = new LongAdder();
    private AtomicInteger i = new AtomicInteger(0); //原子性多线程是安全的

    public void inc(){
        i.getAndIncrement();
        //i.add(1);
    }

    public int get(){
        return i.get();
        //return i.intValue();
    }
}
