package Task1;

import Task1.Entity.Cat;
import Task1.Entity.Human;
import Task1.Entity.Robot;
import Task1.Entity2.RunningTrack;
import Task1.Entity2.Wall;
import Task1.Interface.Obstacles;
import Task1.Interface.Skills;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Human human = new Human();
        Robot robot = new Robot();
        RunningTrack runningTrack = new RunningTrack();
        Wall wall = new Wall();
        Obstacles[] obstacles = new Obstacles[]{runningTrack, wall};
        Skills[] entity = new Skills[]{cat, human, robot};

        firstMethod(cat,human,robot);

        secondMethod(runningTrack,wall,cat,human,robot);

        thirdMethod(obstacles,entity);

    }

    static void firstMethod(Cat cat, Human human, Robot robot) {
        cat.jump();
        cat.run();

        human.jump();
        human.run();

        robot.jump();
        robot.run();

        System.out.println();
    }

    static void secondMethod(RunningTrack runningTrack, Wall wall, Cat cat, Human human, Robot robot) {
        System.out.println("Кот " + runningTrack.jumpOver(cat) + "!");
        System.out.println("Человек " + runningTrack.jumpOver(human) + "!");
        System.out.println("Робот " + runningTrack.jumpOver(robot) + "!");

        System.out.println();


        System.out.println("Кот " + wall.runOver(cat) + "!");
        System.out.println("Человек " + wall.runOver(human) + "!");
        System.out.println("Робот " + wall.runOver(robot) + "!");

        System.out.println();
    }

    static void thirdMethod(Obstacles[] obstacles,Skills[] entity) {
        for (int i = 0; i < entity.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (obstacles[j].doIt(entity[i])) {
                } else j++;
            }
        }
    }
}
