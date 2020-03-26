package Task1.Entity2;

import Task1.Interface.Obstacles;
import Task1.Interface.Skills;

public class Wall implements Obstacles {
    private static int HEIGHT = 2;

    public String runOver(Skills skills) {
        if (skills.jump() >= HEIGHT)
            return "перепрыгнул";
        else
            return "не перепрыгнул";
    }

    @Override
    public boolean doIt(Skills skills) {
        if (skills.jump() > HEIGHT) {
            System.out.println("Перепрыгнул");
            return true;
        } else {
            System.out.println("Не перепрыгнул");
            return false;
        }
    }
}
