package Assignment2;

//ShovelBot
//Defines the services needed for snow collection in SnowMain
//Created By: Alcide Viau
//Last Modified: 19/10/2020

import becker.robots.*;

public class ShovelBot extends RobotSE implements Runnable
{

     private int snowCount = 0;

     // Return this bot's snow counter
     public int getSnowCount() {
          return snowCount;
     }

     public ShovelBot(City city, int i, int i1, Direction direction) {
          super(city, i, i1, direction);
     }

     // Helper method which removes snow and adds to the snow counter
     public void clearSnow() {
          if (this.canPickThing()) {
               // The bot will crash if it tries to pickup something that isn't there, do a check if it can beforehand
               super.pickThing();
               this.snowCount++;
          }
     }

     // Clear a driveway of snow until the bot reaches the road again
     public void clearDriveway() {
          if (checkForDriveWay()) {
               while (true) {
                    clearSnow();

                    if (this.isFacingWest() && !this.frontIsClear()) {
                         // If the bot has hit the main road, align it and break out of the shovel loop
                         this.turnLeft();
                         break;
                    } else if (!this.frontIsClear()) {
                         // If the front isn't clear, turn right
                         this.turnRight();
                    } else {
                         // At this point, we assume the bot is still in the driveway and the front is clear
                         this.move();
                    }
               }
          }
     }

     //Check east of current location for a driveway
     private boolean checkForDriveWay(){
          
          this.turnLeft(); //turn east
          
          //If front is clear there is a driveway
          if(this.frontIsClear()) {
               //Driveway detected
               this.move();
               return true;
          }
          else {
               //No driveway
               this.turnRight();
               return false;
          }
     }//end of checkForDriveWay()

     @Override
     public void run() {
          while(true) {
               this.clearSnow();
               this.clearDriveway();
               this.move();

               // If it's on the main road and there is no more snow, break the loop to stop the bot
               if (!this.canPickThing()) break;
          }
     }
}//end of Class
