package be.intecbrussel.spring.springiscoming.configurations;


import be.intecbrussel.spring.springiscoming.services.implementations.CleaningServiceImplementation;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import be.intecbrussel.spring.springiscoming.tools.implementations.Broom;
import be.intecbrussel.spring.springiscoming.tools.implementations.DisposableDuster;
import be.intecbrussel.spring.springiscoming.tools.implementations.Sponge;
import be.intecbrussel.spring.springiscoming.tools.implementations.Vacuum;
import org.springframework.context.annotation.*;

@Configuration
public class HouseContextConfig {

    @Bean
    @Scope("prototype")
    @Primary
    public CleaningTool broom(){
        return new Broom();
    }

    @Bean
    @Scope("prototype")
    public CleaningTool vacuum(){
        return new Vacuum();
    }
    @Bean
    @Scope("prototype")
    public CleaningTool sponge(){
        return new Sponge();
    }
    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
    public CleaningTool duster(){
        return new DisposableDuster();
    }

    @Bean(name="bartsCleaningService")
    public CleaningServiceImplementation broomService(CleaningTool cleaningTool){
        CleaningServiceImplementation cleaningService = new CleaningServiceImplementation();
        cleaningService.setCleaningTool(cleaningTool);
        return cleaningService;
    }
    @Bean(name="bobsCleaningService")
    public CleaningServiceImplementation spongeService(){
        CleaningServiceImplementation cleaningService = new CleaningServiceImplementation();
        cleaningService.setCleaningTool(broom());
        return cleaningService;
    }
    @Bean(name="suzyCleaningService")
    public CleaningServiceImplementation otherSpongeService(){
        CleaningServiceImplementation cleaningService = new CleaningServiceImplementation();
        cleaningService.setCleaningTool(broom());
        return cleaningService;
    }




}
