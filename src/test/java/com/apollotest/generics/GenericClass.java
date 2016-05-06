package com.apollotest.generics;

/**
 * Created by roy on 2016/5/6.
 */
class Gen<T> {
    T ob;

    Gen(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

class GenericClass {
    public static void main(String args[]){
        Gen<Integer> iOb;

        iOb = new Gen<Integer>(88);

        iOb.showType();

        int a = iOb.getOb();

        System.out.println("value: " + a);

        Gen<String> stringOb = new Gen<String>("Abc");

        stringOb.showType();
    }
}


