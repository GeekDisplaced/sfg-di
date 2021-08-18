package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements I18nGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World Again! - From the Primary Bean";
    }

}
