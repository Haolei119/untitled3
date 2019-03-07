package com.google.ch14;

import org.junit.Test;

public class PrintTest {

    @Test
    public void print(){
        new Thread(()->{
           for (int i = 0; i < 10; i++)
                System.out.printf("%-3d",0);
        }).start();

        new Thread(()->{

//为了实现多线程编程，需要写一个类实现Runnable接口，
// 将这个线程要做的事情卸载该接口的run方法中
            for (int i = 0; i < 10; i++)
        System.out.printf("%-3d",1);
        }).start();
        }
        }

//我们将实现了Runnable接口的类陈作一个任务（job）

//这个任务想要执行，必须要放在Thread类的里面，在调用start方法
 //如
 // Thread t = new Thread(new 任务类)
//  t.start();

//大陆经常问的问题：实现多线程的两种方法
//实现Runnable和继承Thread某类是错误的说法