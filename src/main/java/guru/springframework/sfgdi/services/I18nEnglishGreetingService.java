package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.respository.I18nEnglishGreetingRepository;

public class I18nEnglishGreetingService implements I18nGreetingService {

    private final I18nEnglishGreetingRepository i18nEnglishGreetingRepository;

    public I18nEnglishGreetingService(I18nEnglishGreetingRepository i18nEnglishGreetingRepository) {
        this.i18nEnglishGreetingRepository = i18nEnglishGreetingRepository;
    }

    @Override
    public String sayGreeting() {

        // return "Hello World !";
        return this.i18nEnglishGreetingRepository.getGreeting();
    }

}
