package org.multithreading;

import java.util.LinkedList;
import java.util.List;

public class SimpleBlockingQueue<T> {
    private List<T> queue;
    public SimpleBlockingQueue() {
        queue=new LinkedList<T>();
    }
    public int getSize(){
        synchronized (queue){
            return queue.size();
        }
    }
    public void put(T value){
        synchronized (value){
            queue.add(value);
            queue.notify();
        }
    }
    public T get() throws InterruptedException {
        while (queue.isEmpty()){
            synchronized (queue){
                if (queue.isEmpty()){
                    queue.wait();
                }
                else
              return queue.remove(0);
            }
        }
        return null;
    }
}
