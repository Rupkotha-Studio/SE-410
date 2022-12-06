package org.practice;

class King{
    String KingName;
    int age;
    public King() {

    }
    public King(String kingName, int age) {
        KingName = kingName;
        this.age = age;
    }

    public String getKingName() {
        return KingName;
    }

    public void setKingName(String kingName) {
        KingName = kingName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class Problem2 {
    public static void main(String[] args) {
            var obj=new King();
            var obj1=new King("Siraj",45);
            var obj2=obj1;
    }
}
