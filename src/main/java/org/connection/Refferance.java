package org.connection;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.function.BiFunction;

public class Refferance {
    public static <T> T marge(T a,T b,BiFunction<T,T,T> merge){
      return merge.apply(a,b);
    }
    public static void main(String[] args) {

    }
}
