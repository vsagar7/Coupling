package com.company;

public class Main {

    public static void main(String[] args) {

        // Creating the object directly which is tight coupling
        GreetingClass greetingClass = new GreetingClass();
        greetingClass.greet("Sagar");

        // Creating object using interfaces and factory build patterns.

//        GreetingServiceFactory greetingServiceFactory = new GreetingServiceFactory();
//
//        greetingServiceFactory.getObject("hindi").greet("Nani");
//


    }
}
