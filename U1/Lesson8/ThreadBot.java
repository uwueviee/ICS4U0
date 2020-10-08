package Lesson8;

/**
 * ThreadBot
 * Last Modified: 08/10/2020
 @author Alcide Viau
 **/

import becker.robots.*;

public class ThreadBot extends Robot implements Runnable {

    /**
     * @param city City to operate in
     * @param street X Coordinate to start on
     * @param avenue Y Coordinate to start on
     * @param direction Direction that the Robot faces on start
     **/

    public ThreadBot(City city, int street, int avenue, Direction direction) {
        super(city, street, avenue, direction);
    }

    @Override
    public void run() {
        super.move();
        super.turnLeft();

        super.move();
        super.turnLeft();

        super.move();
        super.turnLeft();

        super.move();
        super.turnLeft();
    }
}
