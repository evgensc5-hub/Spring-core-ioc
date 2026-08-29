package Spring_core_ioc.Spring_core_ioc.common;

import org.springframework.stereotype.Component;

@Component
public class TurkishChef implements Chef{

    @Override
    public String getDailyRecipe() {
        return "Prepara un kebab cu carne de miel, servit cu pilaf de orez si iaurt!";
    }
    public TurkishChef() {
        System.out.println("In constructor" + getClass().getSimpleName() );
    }
}
