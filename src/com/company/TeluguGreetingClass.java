package com.company;

public class  TeluguGreetingClass implements GreetingService{


    @Override
    public void greet(String str) {
        System.out.print("Namasthe "+str);
    }
}
