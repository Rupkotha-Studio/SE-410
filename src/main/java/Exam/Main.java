package Exam;


import java.time.Duration;
class Thread_1 extends Thread{
    public synchronized void display(){
            System.out.println("Thread-1");
    }
    @Override
    public void run() {
        try {
            sleep(Duration.ofSeconds(3));
            display();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Thread_2 extends Thread{
    public synchronized void display(){
            System.out.println("Thread-2");
    }
    @Override
    public void run() {
        try {
            sleep(Duration.ofSeconds(5));
            display();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        var thread1=new Thread_1();
        var thread2=new Thread_2();
        System.out.println("Start");
        thread1.start();
        thread2.start();
    }
}
