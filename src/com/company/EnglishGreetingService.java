package com.company;

public class EnglishGreetingService implements GreetingService {


    @Override
    public void greet(String str) {
        System.out.print("Hello " + str);
    }
}
