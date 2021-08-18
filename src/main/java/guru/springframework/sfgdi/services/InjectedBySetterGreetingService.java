package guru.springframework.sfgdi.services;

/**
 * Created by jt on 12/27/19.
 */
public class InjectedBySetterGreetingService implements I18nGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
