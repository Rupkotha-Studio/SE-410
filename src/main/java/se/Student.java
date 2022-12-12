package se;


class Person{
    private String name;
    private String id;
    private double cgpa;
    private String dept;
    private String section;
    private String mobile;

    public Person(String name, String id, double cgpa, String dept, String section, String mobile) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.dept = dept;
        this.section = section;
        this.mobile = mobile;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return getClass().getName().replace("se.","")+"{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", cgpa=" + cgpa +
                ", dept='" + dept + '\'' +
                ", section='" + section + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public void getCGPA(){
        System.out.println(toString());
    }
}

public class Student extends Person {
    public Student(String name, String id, double cgpa, String dept, String section, String mobile) {
        super(name, id, cgpa, dept, section, mobile);
    }
}
class Teacher{
    public static void main(String[] args) {
        var judge=new Judgement();
        judge.execute(()->{
            var student=new Student("Durjoy Acharya","1925102002",3.67,"CSE","A","01876068550");
            student.getCGPA();
            student.setCgpa(3.85);
            System.out.println(Thread.currentThread().getName());
        });
    }
}
interface Executor{
    void execute(Runnable runnable);
}
class Judgement implements Executor {
    @Override
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}