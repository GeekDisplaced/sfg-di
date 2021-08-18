package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.I18nGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class InjectedByPropertyController {

    @Qualifier("injectedByPropertyGreetingService")
    @Autowired
    public I18nGreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    };
}
