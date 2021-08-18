package guru.springframework.sfgdi.services;

public class I18nGermanGreetingService implements I18nGreetingService {
    @Override
    public String sayGreeting() {
        return "Hallo Welt !";
    }

}
