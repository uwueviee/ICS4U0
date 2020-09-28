package Lesson1;

import becker.robots.*;

public class RoboRace {
    public static void main(String[] args) {
        City goodcity = new City();
        Robot allan = new Robot(goodcity, 0, 1, Direction.EAST);
        Robot nam = new Robot(goodcity, 0, 2, Direction.WEST);

        RoboMisc.turnRight(allan);
        nam.turnLeft();
        allan.move();
        nam.move();
        allan.move();
        nam.move();
        allan.move();
        nam.turnLeft();
        allan.turnLeft();
        nam.move();
        RoboMisc.turnRight(nam);
        RoboMisc.turnRight(allan);
        nam.move();
        RoboMisc.turnRight(allan);
        RoboMisc.turnRight(nam);
        RoboMisc.turnRight(allan);
        nam.move();
        RoboMisc.turnRight(allan);
        allan.move();
    }
}
