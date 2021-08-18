package guru.springframework.sfgdi.services;

/**
 * Created by jt on 12/26/19.
 */

public class InjectedByConstructorGreetingService implements GreetingService {

    public String sayGreeting() {
        return "Hello World Again! - Constructor";
    }

}
