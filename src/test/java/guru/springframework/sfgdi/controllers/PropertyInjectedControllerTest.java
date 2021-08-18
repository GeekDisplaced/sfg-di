package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.InjectedByConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
<<<<<<< Updated upstream
    void setup() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());
=======
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new InjectedByConstructorGreetingService();
>>>>>>> Stashed changes
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}