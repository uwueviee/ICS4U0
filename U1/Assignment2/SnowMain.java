package Assignment2;

//SnowMain
//Main class for snow collection that will create 2 ShovelBot threads
//Created By: Alcide Viau
//Last Modified: 19/10/2020

import becker.robots.*;

public class SnowMain
{
   public static void main(String[] args)
   {
       City c = new City("U1/Assignment2/SnowCity.txt"); // Changed due to personal assignment layout

       //Create Shovel Bot objects
       ShovelBot jeeven = new ShovelBot(c, 0, 2, Direction.SOUTH);
       ShovelBot basmala = new ShovelBot(c, 0, 2, Direction.SOUTH);

       // Skip the first 6 squares for basmala
       basmala.move(6);

       // Create the threads for ShovelBot
       Thread jeevenThread = new Thread(jeeven);
       Thread basmalaThread = new Thread(basmala);

       // Start the threads for ShovelBot
       jeevenThread.start();
       basmalaThread.start();

   }//end of main
}//end of class