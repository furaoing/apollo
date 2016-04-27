package com.apollotest;

/**
 * Created by rao on 16-4-16.
 */
public abstract class testAbstract
{
   private String name;
   private String address;
   private int number;

   public abstract double computePay();

   //Remainder of class definition
}

class Salary extends testAbstract
{
   private double salary; // Annual salary

   public double computePay()
   {
      System.out.println("Computing salary pay for ");
      return salary/52;
   }

   //Remainder of class definition
}
