package Spring_core_ioc.Spring_core_ioc.common;

import org.springframework.stereotype.Component;

@Component
public class FrenchChef implements Chef {

    @Override
    public String getDailyRecipe() {
        return "Preparez un Boeuf Bourguignon avec vin rouge et hergs";
    }

    public FrenchChef() {
        System.out.println("In constructor" + getClass().getSimpleName());
    }
}




