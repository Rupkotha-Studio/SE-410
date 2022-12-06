package org.exception;


import java.util.List;
import java.util.Random;

class CustomException{
    private List<Double> list;
    private int answer;
    public CustomException(List<Double> list) {
        this.list = list;
        list.forEach(e->{
            answer= new Random().nextInt(5);
            if (answer==0)
           {
               try {
                   throw new Exception("Divide by Zero’ error-Durjoy");
               } catch (Exception ex) {
                   throw new RuntimeException(ex);
               }
           }
            double v = e / answer;
            System.out.println(v);
        });
    }

}
public class Problem5i {
    public void customExpection(List<Double> list)
    {
        new CustomException(list);
    }

    public static void main(String...args) {
        //new CustomException(List.of(20.0,30.0,60.0,40.0,50.0,20.0));
        new Problem5i().customExpection(List.of(20.0,30.0,60.0,40.0,50.0,20.0));
    }
}
