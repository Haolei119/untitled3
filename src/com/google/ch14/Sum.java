package com.google.ch14;

import java.util.concurrent.*;

public class Sum implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(3000);
        return 0;
    }
}

 class Test2{
    public static void main(String[] args)  {

        FutureTask<Integer> task = new FutureTask<>(new Sum());
        new Thread(task).start();


        System.out.println(task.isDone());
        try {
            System.out.println(task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class Table{
    public static void main(String[] args)  {
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);

        Runnable r = ()->  concurrentHashMap.merge("Tom",1, Integer::sum);

        executorService.schedule(r,3,TimeUnit.SECONDS);

        executorService.shutdown();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(concurrentHashMap.get("Tom"));


    }
}
