package be.intecbrussel.spring.springiscoming.configurations;

import be.intecbrussel.spring.springiscoming.services.CleaningService;
import be.intecbrussel.spring.springiscoming.services.DomesticService;
import be.intecbrussel.spring.springiscoming.services.GardeningService;
import be.intecbrussel.spring.springiscoming.services.implementations.CleaningServiceImplementation;
import be.intecbrussel.spring.springiscoming.services.implementations.DomesticServiceImplementation;
import be.intecbrussel.spring.springiscoming.services.implementations.GardeningServiceImplementation;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import be.intecbrussel.spring.springiscoming.tools.GardeningTool;
import be.intecbrussel.spring.springiscoming.tools.implementations.Broom;
import be.intecbrussel.spring.springiscoming.tools.implementations.LawnMower;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DomesticServiceAppConfig {

    //make some tool beans
    @Bean
    public CleaningTool broom(){
        return new Broom();
    }
    @Bean
    public GardeningTool lawnMower(){
        return new LawnMower();
    }
    //make some service beans
    @Bean
    public CleaningService cleaningService(CleaningTool cleaningTool){
        return new CleaningServiceImplementation(cleaningTool);
    }
    @Bean
    public GardeningService gardeningService(GardeningTool gardeningTool){
        return new GardeningServiceImplementation(gardeningTool);
    }
    @Bean
    public DomesticService domesticService(GardeningService gardeningService, CleaningService cleaningService){
        return new DomesticServiceImplementation(cleaningService,gardeningService);
    }



}
