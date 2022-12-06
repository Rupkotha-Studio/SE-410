package org.practice;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Game<T> {
    record Sum(int x,int y){};

    void printSum(T data){
        if (data instanceof Sum(int x,int y)){
            System.out.println(x+y);
        }
    }
    static void Sum()
    {
        AtomicInteger count= new AtomicInteger();
        try(var executor= Executors.newVirtualThreadPerTaskExecutor()){
            IntStream.of(0,10_000).forEach(i->{
                executor.submit(()->{
                    System.out.println(count);
                    count.getAndIncrement();
                    Duration.ofSeconds(0);
                    return 1;
                });
            });
        }
    }
    static void gameWithThread() throws InterruptedException {
        var vThread=
        IntStream.range(0,10)
                .mapToObj(index->Thread.ofVirtual().unstarted(()->{
                    if (index==0)
                        System.out.println(Thread.currentThread());
                    try{
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (index==0)
                        System.out.println(Thread.currentThread());
                })).toList();
                vThread.forEach(Thread::start);
        for (Thread thread:vThread) {
            thread.join();

        }




    }
    public static void main(String[] args) throws InterruptedException {
//       var pthread= Thread.ofPlatform()
//                .unstarted(()->{
//                    System.out.println(Thread.currentThread());
//                });
//       var vthread= Thread.ofVirtual()
//                .unstarted(()->{
//                    System.out.println(Thread.currentThread());
//                });
//       vthread.start();
//       vthread.join();
//        System.out.println(vthread.getClass());
//        //Sum();
//      var task=  ForkJoinPool.commonPool()
//                .submit(()-> System.out.println(Thread.currentThread()));
//      task.join();
//        gameWithThread();
//        Sum();
        IntStream.range(0,100).boxed().filter(x->x%2==0).toList().forEach(System.out::println);
    }

}
