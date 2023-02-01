package Exam;



class Thread_s implements Runnable{

    @Override
    public void run() {
        //logic....
    }
}
class Thread_5 extends Thread{
    //Logic...
}


class myThread extends Thread{
    public void say()
    {
        System.out.println("This is HP");
    }

    @Override
    public void run() {
        say();
    }
}

//driver class
public class LThread{
    public static void main(String[] args) {
        var t=new myThread();
        t.start();

    }

}
