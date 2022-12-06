package org.multithreading;

public class Problem5ii {
    public static void main(String...args) {
        try{
            if (args.length==1)
                throw new RuntimeException("illegal args Exception");
        }catch (RuntimeException e)
        {
            e.printStackTrace();
        }

    }
}
