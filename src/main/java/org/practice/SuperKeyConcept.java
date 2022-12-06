package org.practice;
//why this and super
public class SuperKeyConcept {
    int sid;
    String sname;

    public SuperKeyConcept(int id,String sname) {
        sid=id;
        sname = sname;
    }

    public SuperKeyConcept() {
        System.out.println("Constructor");
        System.out.println("Memory Identification Number: "+this.hashCode());
    }

    {
        System.out.println("Non-Static Method");
        System.out.println("Memory Identification Number: "+this.hashCode());
    }
    static {
        System.out.println("Static Method");
        //System.out.println("Memory Identification Number: "+this.hashCode());
    }
    void sayHello()
    {
        System.out.println("Non-Static Method");
        System.out.println("Memory Identification Number: "+this.hashCode());
    }
    public static void sayHi()
    {
        System.out.println("Static Method");
//        System.out.println("Memory Identification Number: "+this.hashCode());
    }
    public static void main(String[] args) {
        new SuperKeyConcept();
        System.out.println("---------------------------");
        new SuperKeyConcept();
        System.out.println(new SuperKeyConcept(1010,"Durjoy").sid);
        System.out.println(new SuperKeyConcept(1010,"Durjoy").sname);
    }
}
