package Task1.Entity;

import Task1.Interface.Skills;

public class Robot implements Skills {

    private int RUN_DISTANCE = 1000;
    private int JUMP_HEIGHT = 3;

    @Override
    public int run() {
        System.out.println("Робот бежит!");
        return RUN_DISTANCE;
    }

    @Override
    public int jump() {
        System.out.println("Робот прыгает!");
        return JUMP_HEIGHT;
    }
}
