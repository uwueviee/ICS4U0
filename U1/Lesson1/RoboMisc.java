package Lesson1;

import becker.robots.Robot;

public class RoboMisc {
    public static void turnRight(Robot robot) {
        robot.turnLeft();
        robot.turnLeft();
        robot.turnLeft();
    }
}
