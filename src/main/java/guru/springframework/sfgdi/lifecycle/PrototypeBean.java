package guru.springframework.sfgdi.lifecycle;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Prototype Bean Created");
    }

    public String getMyScope() {
        return "I'm a Prototype Bean!";
    }
}
