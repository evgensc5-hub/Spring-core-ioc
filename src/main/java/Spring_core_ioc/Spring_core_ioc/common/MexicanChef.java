package Spring_core_ioc.Spring_core_ioc.common;

import org.springframework.stereotype.Component;

@Component
public class MexicanChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return " prepara tacos all pastor con pina...";
    }
}
public MexicanChef() {
    System.out.println("In constructor" + getClass().getSimpleName() );
}
