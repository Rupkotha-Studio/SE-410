package org.practice;


class Thread1 extends Thread {
    public static void setTimeOut(int delay) throws InterruptedException {
       // while (true) {
        sleep(delay);
        System.out.println("Thread-1");

        //}
    }
}
class Thread2 extends Thread {
    public static void setTimeOut(int delay) throws InterruptedException {
            sleep(delay);
            System.out.println("Thread-2");
        System.out.println(getAllStackTraces().getClass());
    }
}
public class Problem7 {
    public static void main(String[] args) throws InterruptedException {
        Thread1.setTimeOut(2000);
        Thread2.setTimeOut(4000);
    }
}
