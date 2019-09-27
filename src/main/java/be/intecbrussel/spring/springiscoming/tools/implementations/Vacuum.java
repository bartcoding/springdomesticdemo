package be.intecbrussel.spring.springiscoming.tools.implementations;

import be.intecbrussel.spring.springiscoming.tools.CleaningTool;

public class Vacuum implements CleaningTool{

    public Vacuum() {
        System.out.println("create vacuum");
    }

    @Override
    public void doCleanJob() {
        System.out.println("bzhwuzwhuzwhu vuuuuuuuuuuuuuuu rrrrrrrrtaktaktaktak boem...ssssssss");
    }
}
