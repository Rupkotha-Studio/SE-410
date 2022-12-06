package se;


class Quarkus{
    private String functionality;
    //copy constructor without changing state of existing object
    public Quarkus(Quarkus quarkus){
        this.functionality= quarkus.functionality;
    }
    //Overloaded Constructor
    public Quarkus(String functionality){this.functionality = functionality;
    }
    public String getFunctionality() {
        return functionality;
    }
}
public class Answer_2 {
    public static void main(String...durjoy) {
        var quarkus=new Quarkus(new Quarkus("A Kubernetes Native Java " +
                "stack tailored" +
                " for OpenJDK HotSpot and GraalVM, crafted from the best" +
                " of breed Java libraries and standards."));
        System.out.println(quarkus.getFunctionality());
    }
}
