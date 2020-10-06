package Lesson1;

import becker.robots.*;

public class ExploreRobot {
    public static void main(String[] args) {
        City goodcity = new City();
        Robot allan = new Robot(goodcity, 0, 0, Direction.EAST);

        for (int i = 0; i < 45; i++) {
            for (int f = 0; f < 90; f++) {
                allan.move();
            }

            RoboMisc.turnRight(allan);
            allan.move();
            RoboMisc.turnRight(allan);

            for (int f = 0; f < 90; f++) {
                allan.move();
            }

            allan.turnLeft();
            allan.move();
            allan.turnLeft();
        }
    }
}
