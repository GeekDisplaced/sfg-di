package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.I18nGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class InjectedByConstructorController {

    private final I18nGreetingService greetingService;

    public InjectedByConstructorController(@Qualifier("injectedByConstructorGreetingService") I18nGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    };

}
