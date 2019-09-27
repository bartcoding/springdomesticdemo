package be.intecbrussel.spring.springiscoming.tools.implementations;

import be.intecbrussel.spring.springiscoming.tools.CleaningTool;

public class Broom implements CleaningTool {
    private int timesUsed;


    public Broom() {
        System.out.println("create broom");
    }

    public void doCleanJob(){
        System.out.println("woosh woosh woosh shwoo shwoo shwooo broomerdebroom for the very " +
                ++timesUsed + " th or nd time");
    }

}
