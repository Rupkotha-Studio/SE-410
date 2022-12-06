package se;


class University{
    public enum Rank{LOW,MEDIUM,HIGH};
    private String UniversityName;
    public String Location;
    public University(String universityName, String location) {
        UniversityName = universityName;
        Location = location;
    }
    public String getUniversityName() {
        return UniversityName;
    }
}
//Single Inheritance
class Department extends University{
    public String departmentName;
    private static final Integer TotalCredit=160;

    public Department(String universityName, String location,String departmentName) {
        super(universityName, location);
        this.departmentName=departmentName;
    }
}
//multi-level inheritance
class Student extends Department{
    public final Integer sId=1925102002;
    public final String StudentName="Durjoy Acharya";
    public Student(String universityName, String location, String departmentName) {
        super(universityName, location, departmentName);

    }
}
//Hierarchical Inheritance
class SmartPhone{
    public String OS;
}
class Samsung extends SmartPhone{
    public String PhoneName;
    public Samsung() {
        PhoneName="Samsung Galaxy Note 10";
        super.OS="ANDROID OPERATING SYSTEM";
    }
    public String getPhoneName() {
        return PhoneName;
    }
    public void getOSInfo()
    {
        System.out.println(OS);
    }
}
class Iphone extends SmartPhone{
    public String PhoneName;
    public Iphone() {
        PhoneName="Iphone 13 pro max";
        super.OS="IOS OPERATING SYSTEM";
    }
    public String getPhoneName() {
        return PhoneName;
    }
    public void getOSInfo()
    {
        System.out.println(OS);
    }
}

public class Answer_1 {
    public static void Single_Inheritance()
    {

        var dept=new Department("Brac University","Dhaka","CSE");
        System.out.println("Single Inheritance");
        System.out.println(dept.getUniversityName());
        System.out.println(dept.Location);
        System.out.println(dept.departmentName);
        System.out.println("Rank: "+University.Rank.HIGH);
    }

    public static void Multi_Level_Inheritance(){
        System.out.println("Multi-level-Inheritance");
        var student=new Student("City University","Khagan,Biruliya,Savar","CSE");
        System.out.println(student.StudentName);
        System.out.println(student.sId);
        System.out.println(student.getUniversityName());
    }
    public static void Hierarchical_Inheritance (){
        //Hierarchical_Inheritance
        var samsung=new Samsung();
        var apple=new Iphone();
        System.out.println(samsung.getPhoneName());
        samsung.getOSInfo();
        System.out.println(apple.getPhoneName());
        samsung.getOSInfo();
    }
    public static void main(String...Durjoy) {
        Single_Inheritance();
        System.out.println("----------------------------------------------------");
        Multi_Level_Inheritance();
        System.out.println("----------------------------------------------------");
        Hierarchical_Inheritance();
    }
}
