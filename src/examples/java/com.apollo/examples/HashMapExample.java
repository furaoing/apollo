package com.apollo.examples;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by roy on 2016/4/1.
 */
public class HashMapExample {
    public static Map m1 = new HashMap();
    HashMapExample(String a, Integer b) {
        m1 = new HashMap();
        m1.put(a, b);
    }
}
