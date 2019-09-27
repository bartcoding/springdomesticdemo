package be.intecbrussel.spring.springiscoming.tools.implementations;

import be.intecbrussel.spring.springiscoming.tools.CleaningTool;
import be.intecbrussel.spring.springiscoming.tools.implementations.DisposableDuster;

public class DisposableDusterProxy implements CleaningTool {
    @Override
    public void doCleanJob() {
        new DisposableDuster().doCleanJob();
    }
}
