package com.google.ch14;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {
    private Lock bankLock = new ReentrantLock();//声明一个锁
    private final double[] accounts;
    private Condition sufficientFunds;//声明一个条件
    private Object Lock = new Object();



    public Bank(int n, double initialBalance){
        accounts = new double[n];
        Arrays.fill(accounts,initialBalance);
        sufficientFunds = bankLock.newCondition();
    }

    
    public void transfer(int from, int to, double amount) {
        //bankLock.lock();//加锁
       try {
            while (accounts[from] < amount)
                sufficientFunds.await();
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf("Total Balance: %10.2f%n", getTOtalBalance());
            sufficientFunds.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        finally {
            bankLock.unlock();//解锁
        }
    }


   public double getTOtalBalance(){
        double sum = 0;

        for (double a : accounts)
            sum+=a;

        return sum;
   }

   public int size(){
        return accounts.length;
   }

}
