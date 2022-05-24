package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {
    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        System.out.println("\nPropertyInjectedControllerTest.setUp(): ");

        controller = new PropertyInjectedController();

        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {

        System.out.println("\nPropertyInjectedControllerTest.getGreeting(): ");
        System.out.println(controller.getGreeting());
    }
}