package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.configurations.DomesticServiceAppConfig;
import be.intecbrussel.spring.springiscoming.configurations.HouseContextConfig;
import be.intecbrussel.spring.springiscoming.services.DomesticService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DomesticApp {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext applicationContext
                     = new AnnotationConfigApplicationContext(DomesticServiceAppConfig.class)) {
            applicationContext.getBean("domesticService", DomesticService.class).doHouseWork();
        }
    }
}
