package org.practice;

public class Problem5iv {
    public static void main(String[] args) {
        try{
            if (0==Integer.parseInt(args[1]))
                throw new RuntimeException("Second Argument Must be Greater than 0");
            try {
                System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
            }catch (ArithmeticException e)
            {
                e.printStackTrace();
            }
        }catch (RuntimeException e)
        {
            e.printStackTrace();
        }
    }
}
