package org.multithreading;


import java.awt.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class University{
    private Lock lock = new ReentrantLock();
    public void Classroom(String FacultyName)
    {
        for (int i = 1; i <=10; i++) {
            lock.lock();
            try {

                System.out.println(i + " Classes Taking By " + FacultyName);

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }
        }
    }
}
class MyThread implements Runnable{
    public University university;
    public String FacultyName;
    public MyThread(University university, String facultyName) {
        this.university = university;
        FacultyName = facultyName;
    }
    @Override
    public void run() {
        university.Classroom(FacultyName);
    }

}
public class City {
    public static void main(String[] args) throws InterruptedException {

//        var thread1=new Thread(new MyThread(new University(),"Fahim Sir"));
//        var thread2=new Thread(new MyThread(new University(),"Sifath Sir"));
//        var thread3=new Thread(new MyThread(new University(),"Bilash Sir"));
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread1.join();
//        thread2.join();
//        thread3.join();
        //var mR=new myRunnable("Durjoy");
//        var frame=new Frame();
//        frame.setBackground(Color.BLUE);
//        frame.setTitle("Advance Java");
//        frame.setBounds(300,300,400,400);
//        //frame.setOpacity(.6f);
//
//        frame.setVisible(true);

    }
}
class myRunnable implements Runnable{
    private Thread thread;

    public myRunnable(String Name) {
        thread=new Thread(this,Name);
        System.out.println("Child Thread: "+thread);
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(thread.getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}