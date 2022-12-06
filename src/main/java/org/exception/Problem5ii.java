package org.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class Problem5ii {
    public void normFunction() throws FileNotFoundException {

        var writer=new PrintWriter(new File("Love.txt"));
        writer.write(new char[]{'D','U','R','J','O','Y','A','C','H','A','R','Y','A'});
        writer.close();
        //        try(var writer=new PrintWriter(new File("Love.txt"))) {

//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } ;
    }
    public static void nestedTryCatch()
    {
        var list= List.of(10,20,30,40,50);

        try {
            System.out.println(list.get(6));//arise ArrayIndexOutOfBoundException
            try {
                System.out.println(list.get(4)/0);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
        }catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
      //  nested(5);
        nestedTryCatch();
    }
   static void nested(int n)
    {
        System.out.println(n);
        if (n==0)
            return;
        else nested(n++);//stackoverflow error

    }
}
