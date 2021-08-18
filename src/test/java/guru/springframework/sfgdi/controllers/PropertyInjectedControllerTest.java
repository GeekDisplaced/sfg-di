package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.InjectedByConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    InjectedByPropertyController controller;

    @BeforeEach
    void setUp() {
        controller = new InjectedByPropertyController();

        controller.greetingService = new InjectedByConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}