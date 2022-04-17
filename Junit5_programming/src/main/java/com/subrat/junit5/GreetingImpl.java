package com.subrat.junit5;

public class GreetingImpl implements Greeting {

    private  GreetingService  greetingService;

    @Override
    public String greet(String name) {

        return greetingService.greet(name);
    }
}
