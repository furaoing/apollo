package com.apollo.examples.testinterface;

/**
 * Created by roy on 2016/5/5.
 */

public interface Animal {
    public void eat();
    public void travel();
}

class DogFamily {
    void sleep() {
       System.out.println("Start Sleeping");
    }
}

interface WalkAni {
    public void walk();
}

