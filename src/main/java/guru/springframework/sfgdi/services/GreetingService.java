package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface GreetingService {

    @Autowired
    String sayGreeting();

}