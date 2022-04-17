package com.subrat.junit5;

public class GreetingImpl implements Greeting {

    @Override
    public String greet(String name) {

        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException();
        }

        return "Hello " + name;
    }

}
