package com.sfgdi.sfgdi.controller;

import com.sfgdi.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();

    }
}
