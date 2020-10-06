package Assignment1;

//VaultIcon
//Creates an icon for Vault
//Created By: Alcide Viau
//Last Modified: 06/10/2020

import becker.robots.icons.*;
import java.awt.*;

public class VaultIcon extends Icon {
    public VaultIcon(double size) {
        super(size);
    }

    protected void paintIcon(Graphics g) {
        // Draw the black back rectangle
        g.setColor(Color.black);
        g.fillRect(25, 0, 20, 100);

        // Draw the red boxes
        g.setColor(Color.red);
        g.fillRect(10, 0, 20, 20);
        g.fillRect(10, 35, 20, 20);
        g.fillRect(10, 75, 20, 20);

        // Draw the white boxes
        g.setColor(Color.white);
        g.fillRect(10, 20, 20, 15);
        g.fillRect(10, 55, 20, 20);
    }
}//end of class