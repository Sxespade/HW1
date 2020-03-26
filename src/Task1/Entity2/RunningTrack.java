package Task1.Entity2;

import Task1.Interface.Obstacles;
import Task1.Interface.Skills;

public class RunningTrack implements Obstacles {

    private static int DISTANCE = 600;

    public String jumpOver(Skills skills) {
        if (skills.run() >= DISTANCE)
            return "пробежал";
        else
            return "не пробежал";
    }

    @Override
    public boolean doIt(Skills skills) {
        if (skills.run() > DISTANCE) {
            System.out.println("Пробежал");
            return true;
        } else {
            System.out.println("Не пробежал");
            return false;
        }
    }
}
