package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService){
        System.out.println("\nSetterInjectedController.setGreetingService()");
        this.greetingService = greetingService;
    }

    public String getGreeting(){

        System.out.println("\nSetterInjectedController.getGreeting(): ");
        return greetingService.sayGreeting();
    }

}
