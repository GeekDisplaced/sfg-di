package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Profile("en")
    @Primary
    @Bean("i18nGreetingService")
    I18nEnglishGreetingService i18nEnglishGreetingService() {

    }

    @Profile("de")
    @Bean("i18nGreetingService")
    I18nGermanGreetingService i18nGermanGreetingService() {

    }

    @Profile("es")
    @Bean("i18nGreetingService")
    I18nSpanishGreetingService i18nSpanishGreetingService() {

    }

    @Bean
    InjectedByConstructorGreetingService injectedByConstructorGreetingService() {

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
