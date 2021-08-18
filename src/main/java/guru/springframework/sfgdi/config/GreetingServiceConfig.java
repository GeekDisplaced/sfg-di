package guru.springframework.sfgdi.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.respository.I18nEnglishGreetingRepository;
import guru.springframework.sfgdi.respository.I18nEnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory){
       return petServiceFactory.getPetService("dog");
    }

    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory){
    @Profile("cat")
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    I18nEnglishGreetingRepository i18nEnglishGreetingRepository() {

        return new I18nEnglishGreetingRepositoryImpl();
    }

    @Profile({"en", "default"})
    @Bean("i18nGreetingService")
    I18nEnglishGreetingService i18nEnglishGreetingService(I18nEnglishGreetingRepository i18nEnglishGreetingRepository) {

        return new I18nEnglishGreetingService(i18nEnglishGreetingRepository);
    }

    @Profile("de")
    @Bean("i18nGreetingService")
    I18nGermanGreetingService i18nGermanGreetingService() {

        return new I18nGermanGreetingService();
    }

    @Profile("es")
    @Bean("i18nGreetingService")
    I18nSpanishGreetingService i18nSpanishGreetingService() {

        return new I18nSpanishGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
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
