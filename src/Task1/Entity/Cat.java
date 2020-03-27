package Task1.Entity;

import Task1.Interface.Skills;

public class Cat implements Skills {

    private int RUN_DISTANCE = 700;
    private int JUMP_HEIGHT = 2;


    @Override
    public int run() {
        System.out.println("Кот бежит!");
        return RUN_DISTANCE;
    }

    @Override
    public int jump() {
        System.out.println("Кот прыгает!");
        return JUMP_HEIGHT;
    }


}
