package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

<<<<<<< Updated upstream:src/main/java/guru/springframework/sfgdi/services/ConstructorGreetingService.java
@Service
public class ConstructorGreetingService implements GreetingService {
=======
/**
 * Created by jt on 12/26/19.
 */
public class InjectedByConstructorGreetingService implements GreetingService {
>>>>>>> Stashed changes:src/main/java/guru/springframework/sfgdi/services/InjectedByConstructorGreetingService.java
    @Override
    public String sayGreeting() {
        return "Hello World Again! - Constructor";
    }

}
