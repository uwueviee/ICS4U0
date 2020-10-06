package Assignment1;

import becker.robots.*;
import java.awt.*;

public class JumpingGym{
  
  public static void main (String[] args)
  {
    City myCity = new City(15,15);
   
    GymBot test = new GymBot(myCity, 5,1, Direction.EAST);
    
    Wall wall01 = new Wall (myCity, 5,0,Direction.SOUTH);
    Wall wall02 = new Wall (myCity, 5,1,Direction.SOUTH);
    Wall wall03 = new Wall (myCity, 5,2,Direction.SOUTH);
    Wall wall04 = new Wall (myCity, 5,3,Direction.SOUTH);
    Wall wall05 = new Wall (myCity, 5,4,Direction.SOUTH);
    Wall wall06 = new Wall (myCity, 5,5,Direction.SOUTH);  
    Wall wall07 = new Wall (myCity, 5,6,Direction.SOUTH);    
    Wall wall08 = new Wall (myCity, 5,7,Direction.SOUTH);
    Wall wall09 = new Wall (myCity, 5,8,Direction.SOUTH);
    Wall wall10 = new Wall (myCity, 5,9,Direction.SOUTH);
    Wall wall11 = new Wall (myCity, 5,10,Direction.SOUTH);
    Wall wall12 = new Wall (myCity, 5,11,Direction.SOUTH);
    Wall wall13 = new Wall (myCity, 5,12,Direction.SOUTH);
    Wall wall14 = new Wall (myCity, 5,13,Direction.SOUTH);
    
    Vault jumpVault = new Vault(myCity, 5,8, Direction.NORTH);
    
    test.move();
    test.shortJump();
    test.move();
    test.move();
    test.move();
    
    test.highJump();
       
    test.shortJump();
    
    test.move();
    
  }
}


    
