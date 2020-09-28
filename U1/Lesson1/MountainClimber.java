package Lesson1;

import becker.robots.*;

public class MountainClimber {
    public static void main(String[] args) {
        City goodcity = new City();
        Robot allan = new Robot(goodcity, 3, 0, Direction.EAST);
        Thing xai = new Thing(goodcity, 3, 1);

        allan.move();
        allan.pickThing();
        allan.turnLeft();
        allan.move();
        RoboMisc.turnRight(allan);
        allan.move();
        allan.turnLeft();
        allan.move();
        allan.move();
        RoboMisc.turnRight(allan);
        allan.move();
        allan.move();
        RoboMisc.turnRight(allan);
        allan.move();
        allan.turnLeft();
        allan.move();
        RoboMisc.turnRight(allan);
        allan.move();
        allan.move();
    }
}
