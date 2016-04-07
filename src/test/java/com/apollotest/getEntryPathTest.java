package com.apollotest;

/**
 * Created by roy on 2016/4/6.
 */
public class getEntryPathTest {

    public static void main(String[] args)
    {
        ClassLoader loader = getEntryPathTest.class.getClassLoader();
        //System.out.println(loader.getResource("foo/Test.class"));
        ClassLoader b = Thread.currentThread().getContextClassLoader();
        int a = 1;
    }
}

