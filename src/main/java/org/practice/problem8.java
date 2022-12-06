package org.practice;

class Printer{
    private int pages;

    public Printer(int pages) {
        this.pages = pages;
    }
    public boolean ifBusy()
    {
        return pages > 0;
    }
    public void InkLevel(int pages)
    {
        this.pages=this.pages-pages;
        System.out.println("Ink Level: "+((this.pages)/100));
    }

}
class customer{
    private static final java.util.Scanner sc=new java.util.Scanner(System.in);
    private Printer printer;
    private String Name;

    public customer(Printer printer, String name) {
        this.printer = printer;
        Name = name;
    }
    public void engine()
    {
        new Thread(()->{
          synchronized (printer){
              int lebel= sc.nextInt();
              sc.close();
              if (printer.ifBusy())
              {
                  System.out.println(Name);

              }
          }
        }).start();
    }
}
public class problem8 {

    public static void main(String[] args) {
       // new customer(new Printer(10),"HP XP").engine();

    }
}
