package guru.springframework.sfgdi.respositories;

public class I18nEnglishGreetingRepositoryImpl implements I18nEnglishGreetingRepository {

    @Override
    public String getGreeting(){
        return "Hello World - From the English Repository";
    };
}
