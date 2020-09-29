package Lesson2;

import javax.swing.*;
import java.awt.*;

    public class SimpleGUI {
        public static void main(String[] args) {
            JFrame main = new JFrame();
            JPanel contents = new JPanel();

            JTextArea text = new JTextArea("AAAA");
            JButton button = new JButton("BBBB");

            text.setWrapStyleWord(true);

            contents.add(text);
            contents.add(button);

            main.setContentPane(contents);

            main.setTitle("CCCC");
            main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            main.setLocation(250,100);
            main.setSize(300,150);
            main.setVisible(true);
        }
    }
