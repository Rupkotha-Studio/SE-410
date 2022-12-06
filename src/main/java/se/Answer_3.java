package se;


class Micronaut{
    private String functionality;
    private int releaseYear;
    private String developerName;
    //this key can access private member of a class
    public Micronaut(String functionality, int releaseYear, String developerName) {
        this.functionality = functionality;
        this.releaseYear = releaseYear;
        this.developerName = developerName;
    }
    @Override
    public String toString() {
        return "Micronaut{" +
                "functionality='" + functionality + '\'' +
                ", releaseYear=" + releaseYear +
                ", developerName='" + developerName + '\'' +
                '}';
    }
}
//Driver class
public class Answer_3 {
    public static void main(String... durjoy) {
        var s=new Micronaut("Micronaut is a software framework " +
                "for the Java virtual machine platform\n",2018,"Graeme Rocher\n");
        System.out.println(s);
    }
}
