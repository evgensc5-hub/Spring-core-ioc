package Spring_core_ioc.Spring_core_ioc.common;

import org.springframework.stereotype.Component;

@Component
public class Mexicanchef {
    @Override
    public String getDailyRecipe() {
        return " prepara tacos all pastor con pina...";
    }
}
