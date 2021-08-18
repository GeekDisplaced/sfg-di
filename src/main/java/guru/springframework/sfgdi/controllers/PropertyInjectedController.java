package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

<<<<<<< Updated upstream
    @Qualifier("propertyGreetingService")
=======
    @Qualifier("injectedByPropertyGreetingService")
>>>>>>> Stashed changes
    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    };
}
