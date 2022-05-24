package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting(){

        System.out.println("\nPropertyInjectedController.getGreeting(): ");
        return greetingService.sayGreeting();
    }
}
