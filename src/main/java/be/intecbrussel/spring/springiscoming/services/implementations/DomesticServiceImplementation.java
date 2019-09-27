package be.intecbrussel.spring.springiscoming.services.implementations;

import be.intecbrussel.spring.springiscoming.services.CleaningService;
import be.intecbrussel.spring.springiscoming.services.DomesticService;
import be.intecbrussel.spring.springiscoming.services.GardeningService;

public class DomesticServiceImplementation implements DomesticService {
    private CleaningService cleaningService;
    private GardeningService gardeningService;

    public DomesticServiceImplementation(CleaningService cleaningService, GardeningService gardeningService) {
        this.cleaningService = cleaningService;
        this.gardeningService = gardeningService;
    }

    public void setCleaningService(CleaningService cleaningService) {
        this.cleaningService = cleaningService;
    }

    public void setGardeningService(GardeningService gardeningService) {
        this.gardeningService = gardeningService;
    }

    @Override
    public void doHouseWork() {
        System.out.println("lets do some domestic work!");
        cleaningService.clean();
        gardeningService.garden();
    }
}
