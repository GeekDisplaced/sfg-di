package guru.springframework.sfgdi.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.respositories.I18nEnglishGreetingRepository;
import guru.springframework.sfgdi.respositories.I18nEnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.*;

@EnableConfigurationProperties(SfgConstructorConfig.class)
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(SfgConstructorConfig sfgConstructorConfig){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConstructorConfig.getUsername());
        fakeDataSource.setPassword(sfgConstructorConfig.getPassword());
        fakeDataSource.setJdbcUrl(sfgConstructorConfig.getJdbcurl());
        return fakeDataSource;
    }

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService(PetServiceFactory petServiceFactory){
       return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService(PetServiceFactory petServiceFactory){
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

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

//    @Bean
//    InjectedByConstructorGreetingService injectedByConstructorGreetingService() {
//
//        return new InjectedByConstructorGreetingService();
//    }
//
//    @Bean
//    InjectedBySetterGreetingService injectedBySetterGreetingService() {
//
//        return new InjectedBySetterGreetingService();
//    }
//
//    @Bean
//    InjectedByPropertyGreetingService injectedByPropertyGreetingService() {
//
//        return new InjectedByPropertyGreetingService();
//    }
}
