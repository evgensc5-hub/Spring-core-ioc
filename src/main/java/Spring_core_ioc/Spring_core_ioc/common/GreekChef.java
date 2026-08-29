package Spring_core_ioc.Spring_core_ioc.common;

import Spring_core_ioc.Spring_core_ioc.common.Chef;

public class GreekChef implements Chef {

    //constructor
    public GreekChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe() {
        return "Greek Salad - A fresh and healthy mix of tomatoes, cucumbers..";
    }
}
