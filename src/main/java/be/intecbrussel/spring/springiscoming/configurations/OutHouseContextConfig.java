package be.intecbrussel.spring.springiscoming.configurations;

import be.intecbrussel.spring.springiscoming.services.GardeningService;
import be.intecbrussel.spring.springiscoming.services.implementations.GardeningServiceImplementation;
import be.intecbrussel.spring.springiscoming.tools.GardeningTool;
import be.intecbrussel.spring.springiscoming.tools.implementations.LawnMower;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OutHouseContextConfig {
    @Bean
    public GardeningTool lawnMower(){
        return new LawnMower();
    }

}
