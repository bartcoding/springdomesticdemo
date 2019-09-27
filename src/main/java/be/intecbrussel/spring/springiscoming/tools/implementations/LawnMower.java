package be.intecbrussel.spring.springiscoming.tools.implementations;

import be.intecbrussel.spring.springiscoming.tools.GardeningTool;

public class LawnMower implements GardeningTool {
    public LawnMower() {
        System.out.println("lawnmower is created");
    }

    @Override
    public void doGardenJob() {
        System.out.println("mow mow mow mowowowowowowowowowo");
    }
}
