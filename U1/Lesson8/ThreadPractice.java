package Lesson8;

/**
 * ThreadPractice
 * Last Modified: 08/10/2020
 @author Alcide Viau
 **/

import becker.robots.*;

public class ThreadPractice {
    public static void main(String[] args) {
        City city = new City();

        ThreadBot bot1 = new ThreadBot(city, 1, 1, Direction.NORTH);
        ThreadBot bot2 = new ThreadBot(city, 1, 2, Direction.EAST);
        ThreadBot bot3 = new ThreadBot(city, 2, 2, Direction.SOUTH);
        ThreadBot bot4 = new ThreadBot(city, 2, 1, Direction.WEST);

        Thread bot1Thread = new Thread(bot1);
        Thread bot2Thread = new Thread(bot2);
        Thread bot3Thread = new Thread(bot3);
        Thread bot4Thread = new Thread(bot4);

        bot1Thread.start();
        bot2Thread.start();
        bot3Thread.start();
        bot4Thread.start();
    }
}
