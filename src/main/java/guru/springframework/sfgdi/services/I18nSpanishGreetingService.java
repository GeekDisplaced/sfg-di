package guru.springframework.sfgdi.services;

public class I18nSpanishGreetingService implements I18nGreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo !";
    }

}
