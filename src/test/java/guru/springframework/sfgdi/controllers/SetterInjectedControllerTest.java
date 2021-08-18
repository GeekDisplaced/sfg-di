package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.InjectedByConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    InjectedBySetterController controller;

    @BeforeEach
    void setUp() {
        controller = new InjectedBySetterController();
        controller.setGreetingService(new InjectedByConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}