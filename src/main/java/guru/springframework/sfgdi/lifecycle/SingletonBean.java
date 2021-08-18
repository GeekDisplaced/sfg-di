package guru.springframework.sfgdi.lifecycle;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Singleton Bean Created");
    }

    public String getMyScope() {
        return "I'm a Singleton Bean!";
    }
}
