package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    //@Autowired
    private GreetingService greetingService;
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        System.out.println("\nSetterInjectedController.setGreetingService()");
        this.greetingService = greetingService;
    }

    public String getGreeting(){

        System.out.println("\nSetterInjectedController.getGreeting(): ");
        return greetingService.sayGreeting();
    }

}
