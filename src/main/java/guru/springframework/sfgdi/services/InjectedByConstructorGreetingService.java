package guru.springframework.sfgdi.services;

/**
 * Created by jt on 12/26/19.
 */
public class InjectedByConstructorGreetingService implements I18nGreetingService {

    public String sayGreeting() {
        return "Hello World Again! - Constructor";
    }

}
