package com.company;

public class FrenchGreetingClass implements  GreetingService{


    @Override
    public void greet(String str) {
        System.out.print("Bonjour " + str);
    }
}
