package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.I18nGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final I18nGreetingService i18nGreetingService;

    public I18nController(@Qualifier("i18nGreetingService") I18nGreetingService i18nGreetingService) {
        this.i18nGreetingService = i18nGreetingService;
    }

    public String getGreeting(){
        return i18nGreetingService.sayGreeting();
    };

}
