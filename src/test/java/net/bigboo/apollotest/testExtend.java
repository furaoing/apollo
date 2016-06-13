package net.bigboo.apollotest;

import net.bigboo.apollo.tmp.baseClass;

/**
 * Created by roy on 2016/4/21.
 */

class classExtend extends baseClass {
    public void myMethod(int tt){

        System.out.print("This is a subclass method");
        super.myMethod("ttt");
    }
}

public class testExtend {
    public static void main(String arg[]){
        classExtend a = new classExtend();
        a.myMethod(1);

    }
}

