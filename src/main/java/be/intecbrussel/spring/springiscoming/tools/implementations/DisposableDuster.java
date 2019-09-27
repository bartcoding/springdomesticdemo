package be.intecbrussel.spring.springiscoming.tools.implementations;

import be.intecbrussel.spring.springiscoming.tools.CleaningTool;

public class DisposableDuster implements CleaningTool {
    private boolean clean = true;

    public DisposableDuster() {
        System.out.println("create disposable duster");
    }

    @Override
    public void doCleanJob() {
        if (clean) {
            System.out.println("swifferdeswif");
            clean = false;
        } else {
            System.out.println("I'm a dirty dirty duster");
        }
    }
}
