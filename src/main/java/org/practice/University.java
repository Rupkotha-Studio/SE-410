package org.practice;
//Multilevel Inheritance
public class University {
    public void UniName()
    {
        System.out.println("City University");
    }
}
class Department extends University{
    public void DeptName()
    {
        System.out.println("Department Of Computer Science & Engineering");
    }
}
class Student extends Department{
    public void SName()
    {
        System.out.println("Durjoy Acharya");
    }
}

//Single Inheritance
class Father{
    public static void FName()
    {
        System.out.println("Father Class....");
    }
}
class Son extends Father{
    public static void SName()
    {
        System.out.println("Son Class....");
    }
}

class Animal {
    public void sayName()
    {
        System.out.println("Animal Class :");
    }
}
class Cat extends Animal{
    public void catName()
    {
        System.out.println("Cat Class....");
    }
}
class Bird extends Animal{
    public void BirdName()
    {
        System.out.println("Bird Class....");
    }
}
class Solution {
    public static void main(String[] args) {
        new Student();
    }
}