package Spring_core_ioc.Spring_core_ioc.config;

import Spring_core_ioc.Spring_core_ioc.common.Chef;
import Spring_core_ioc.Spring_core_ioc.common.GreekChef;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


    @Configuration
    public class RestaurantConfig {
        @Bean
        public Chef greekChef() {
            return new GreekChef();
        }
    }
