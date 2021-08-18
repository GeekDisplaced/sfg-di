package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements I18nGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World Again! - Setter";
    }

}
