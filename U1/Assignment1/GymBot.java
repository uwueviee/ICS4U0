package Assignment1;

//VaultIcon
//Defines the movement methods for JumpingGym
//Created By: Alcide Viau
//Last Modified: 06/10/2020

import becker.robots.*;
import java.awt.*;

public class GymBot extends RobotSE {
    public GymBot(City city, int i, int i1, Direction direction) {
        super(city, i, i1, direction);
        // Set the bot color to be blue
        this.setColor(Color.blue);
    }

    // Moves the bot once and flips it around twice
    public void move() {
        super.move();

        super.turnAround();
        super.turnAround();
    }

    // Moves the bot around a single intersection
    public void shortJump() {
        super.turnLeft();
        super.move();

        super.turnRight();
        super.move();

        super.turnRight();
        super.move();
        super.turnLeft();
    }

    // Moves the bot around 4 intersections while having a 2 intersection run up with a somersault ending
    public void highJump() {
        super.turnAround();
        super.move();
        super.move();

        super.turnAround();
        super.move();
        super.move();

        super.turnLeft();
        super.move();
        super.turnRight();

        super.move();
        super.move();
        super.move();
        super.move();

        super.turnRight();
        super.move();

        super.turnAround();
        super.turnAround();
        super.turnLeft();
    }
}// end of class