package com.company;

public class GreetingServiceFactory {

    public GreetingService getObject(String str) {
        if (str.equalsIgnoreCase("english")) {
            return new EnglishGreetingService();
        } else if (str.equalsIgnoreCase("french")) {
            return new FrenchGreetingClass();
        } else if (str.equalsIgnoreCase("Spanish")) {
            return new SpanishGreetingClass();
        } else if (str.equalsIgnoreCase("Telugu")) {
            return new TeluguGreetingClass();
        }else{
            return (GreetingService) new RuntimeException();
        }

    }
}




