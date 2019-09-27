package be.intecbrussel.spring.springiscoming;

import be.intecbrussel.spring.springiscoming.configurations.HouseContextConfig;
import be.intecbrussel.spring.springiscoming.services.implementations.CleaningServiceImplementation;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {

    public static void main(String[] args) {

/*
        CleaningService cleaningService = new CleaningService();
        cleaningService.setCleaningTool(new DisposableDusterProxy());
        cleaningService.clean();
*/


        try(ConfigurableApplicationContext applicationContext
                = new AnnotationConfigApplicationContext(HouseContextConfig.class);) {
            CleaningServiceImplementation barts = applicationContext.getBean("bartsCleaningService", CleaningServiceImplementation.class);

            barts.clean();
            barts.clean();
            barts.clean();
            barts.clean();



        }












    }

}
