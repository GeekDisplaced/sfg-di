package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.InjectedByConstructorGreetingService;
import guru.springframework.sfgdi.services.InjectedByPropertyGreetingService;
import guru.springframework.sfgdi.services.InjectedBySetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    InjectedByConstructorGreetingService injectedByConstructcrGreetingService() {
        return new InjectedByConstructorGreetingService();
    }

    @Bean
    InjectedBySetterGreetingService injectedBySetterGreetingService() {
        return new InjectedBySetterGreetingService();
    }

    @Bean
    InjectedByPropertyGreetingService injectedByPropertyGreetingService() {
        return new InjectedByPropertyGreetingService();
    }
}
