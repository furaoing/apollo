package com.apollo.examples.testinterface;

/**
 * Created by roy on 2016/5/5.
 */

class Mamal extends DogFamily implements Animal, WalkAni {
    public void eat() {
        System.out.println("Just ate some food");
    }

    public void travel() {
        System.out.println("Just travelled");
    }

    public void walk() {
        System.out.println("Just walked");
    }
}

public class MamalTest {
    public static void main(String[] args)
    {
        Mamal myDog = new Mamal();
        myDog.walk();
    }
}
