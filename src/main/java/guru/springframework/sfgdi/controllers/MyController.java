package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.I18nGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final I18nGreetingService i18nGreetingService;

    // no @Qualifier here so will use the @Primary if multi available
    public MyController(I18nGreetingService i18nGreetingService) {

        this.i18nGreetingService = i18nGreetingService;
    }

    public String getGreeting(){
        return i18nGreetingService.sayGreeting();
    };
}
