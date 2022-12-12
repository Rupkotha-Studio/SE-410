package org.practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

record Loan(double amount){};
record Circle(double radius){};
public class Answer_9<T> {
    private List<T> list;
    private Date date;
    private String string;

    public Answer_9(List<T> list, Date date, String string) {
        this.list = list;
        this.date = date;
        this.string = string;
        list.add((T) new Loan(5000));
        list.add((T) new Circle(5.5));
        list.add((T) string);
        list.add((T) date);
    }

    @Override
    public String toString() {
        List<String> list1=new ArrayList<>();
        list.forEach(e->{
            list1.add(String.valueOf(e));
        });
        return list.toString();
    }

    public static void main(String[] args) {
        var obj=new Answer_9<Object>(new ArrayList<Object>(),new Date(),"Durjoy Acharya");
        System.out.println(obj);
    }
}
