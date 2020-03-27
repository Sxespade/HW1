package Task1.Entity;

import Task1.Interface.Skills;

public class Human implements Skills {

    private int RUN_DISTANCE = 500;
    private int JUMP_HEIGHT = 1;

    @Override
    public int run() {
        System.out.println("Человек бежит!");
        return RUN_DISTANCE;
    }

    @Override
    public int jump() {
        System.out.println("Человек прыгает!");
        return JUMP_HEIGHT;
    }
}
