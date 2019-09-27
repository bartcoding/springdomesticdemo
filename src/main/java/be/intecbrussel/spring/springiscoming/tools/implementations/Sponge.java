package be.intecbrussel.spring.springiscoming.tools.implementations;

import be.intecbrussel.spring.springiscoming.tools.CleaningTool;

public class Sponge implements CleaningTool {

    public Sponge() {
        System.out.println("create sponge");
    }

    @Override
    public void doCleanJob() {
        System.out.println("splish splash, i'm a sponge and I like to sit on the ocean floor");
    }
}
