package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.I18nGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class InjectedBySetterController {

    private I18nGreetingService greetingService;

    @Qualifier("injectedBySetterGreetingService")
    @Autowired
    public void setGreetingService(I18nGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    };
}
