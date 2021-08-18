package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.InjectedByConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    InjectedByConstructorController controller;

    @BeforeEach
    void setUp() {
        controller = new InjectedByConstructorController(new InjectedByConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}