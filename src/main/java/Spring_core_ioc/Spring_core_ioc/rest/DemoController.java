package Spring_core_ioc.Spring_core_ioc.rest;

import Spring_core_ioc.Spring_core_ioc.common.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Chef myChef;

    //constructor
    @Autowired
    public DemoController(Chef theChef) {
       myChef = theChef;
     //   @Autowired
     //    public void setMyChef(Chef theChef) {
        //       myChef = theChef;
    }
    @GetMapping("/dailyrecipe")
    public String getDailyRecipe() {
        return myChef.getDailyRecipe();
    }
}
