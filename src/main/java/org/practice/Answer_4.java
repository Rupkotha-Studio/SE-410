package org.practice;

class A{
    public static int a=1925102002;
    public static int x=1925102002;
    public int normVar;

    public A(int normVar) {
        this.normVar = normVar;
    }

    public int getNormVar() {
        return normVar;
    }
}
class B extends A{
    public int x;
    public B(int normVar) {
        super(normVar);
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void display()
    {
        System.out.println("A class x: "+a);
        System.out.println("A class norm var:"+getNormVar());
        System.out.println("Class B hidden var: "+x);
    }
}
public class Answer_4 {
    public static void main(String[] args) {
      var obj=  new B(25);
      obj.setX(45);
      obj.display();
    }
}
