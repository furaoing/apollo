package net.bigboo.apollotest.generics;

/**
 * Created by roy on 2016/5/6.
 */

public class GenericMethod {
    public static <E extends Number> double add(E a, E b){
        double c = a.doubleValue() + b.doubleValue();
        System.out.println();
        return c;
    }

    public static void main(String args[]){
        double result = add(1, 2);
        System.out.println(result);
    }
}
