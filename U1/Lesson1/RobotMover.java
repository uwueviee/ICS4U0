package Lesson1;

import becker.robots.*;

public class RobotMover {
    public static void main(String[] args) {
        City goodcity = new City();
        Robot allan = new Robot(goodcity, 1, 0, Direction.EAST);
        Thing xai = new Thing(goodcity, 1, 2);

        allan.move();
        allan.move();
        allan.pickThing();
        RoboMisc.turnRight(allan);
        allan.move();
        allan.putThing();
        allan.move();
    }
}
