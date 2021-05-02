package com.company;

public class SpanishGreetingClass implements  GreetingService{


    @Override
    public void greet(String str) {
        System.out.print("Hola " + str);
    }
}
