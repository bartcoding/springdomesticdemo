package be.intecbrussel.spring.springiscoming.services.implementations;

import be.intecbrussel.spring.springiscoming.services.GardeningService;
import be.intecbrussel.spring.springiscoming.tools.GardeningTool;

public class GardeningServiceImplementation implements GardeningService {
    private GardeningTool gardeningTool;

    public GardeningServiceImplementation(GardeningTool gardeningTool) {
        this.gardeningTool = gardeningTool;
    }

    public void setGardeningTool(GardeningTool gardeningTool) {
        this.gardeningTool = gardeningTool;
    }

    @Override
    public void garden() {
        System.out.println("LET S GET GREEEEN");
        gardeningTool.doGardenJob();
    }
}
