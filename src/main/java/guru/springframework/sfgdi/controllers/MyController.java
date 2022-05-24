package guru.springframework.sfgdi.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("\nHello World!!!\tMyController.sayHello()");

        return "\nhi folks!\tMyController.sayHello()";
    }
}
