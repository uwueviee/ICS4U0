package Assignment1;

//Vault
//Creates an impassable object that cannot be picked up
//Created By: Alcide Viau
//Last Modified: 06/10/2020

import becker.robots.*;

public class Vault extends Wall {
    public Vault(City city, int i, int i1, Direction direction) {
        super(city, i, i1, direction);
        // Change the icon to the new VaultIcon
        this.setIcon(new VaultIcon(1));
    }
}//end of class