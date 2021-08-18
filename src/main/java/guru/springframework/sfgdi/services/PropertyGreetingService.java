package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements I18nGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World Again! - Property";
    }

}
