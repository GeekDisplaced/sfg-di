package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.InjectedByConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
<<<<<<< Updated upstream
    void setup() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
=======
    void setUp() {
        controller = new ConstructorInjectedController(new InjectedByConstructorGreetingService());
>>>>>>> Stashed changes
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}