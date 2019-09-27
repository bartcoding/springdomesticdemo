package be.intecbrussel.spring.springiscoming.services.implementations;

import be.intecbrussel.spring.springiscoming.services.CleaningService;
import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import be.intecbrussel.spring.springiscoming.tools.implementations.Broom;

public class CleaningServiceImplementation implements CleaningService {

    private CleaningTool cleaningTool ;

    public CleaningServiceImplementation(){

    }

    public CleaningServiceImplementation(CleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;
    }

    public void setCleaningTool(CleaningTool cleaningTool) {
        this.cleaningTool = cleaningTool;
    }

    public void clean(){
        System.out.println("cleaningService will now start cleaning, please hold");
        cleaningTool.doCleanJob();
    }


}
