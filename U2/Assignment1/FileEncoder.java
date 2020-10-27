package Assignment1;

import java.util.*;
import java.io.*;
import javax.swing.*;


public class FileEncoder {

     static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

     /*Main Method to run program*/
     public static void main(String[] args) {
          Scanner fileScanner = getScanner("Choose the file you would like to be encoded");
          int codeOffset = Prompt.getInt("Choose the offset from 10 to -10");

          String toBeEncoded = "";

          while (fileScanner.hasNext()) {
               toBeEncoded += fileScanner.nextLine();
               toBeEncoded += "\n";
          }

          String finalMessage = encodeMsg(toBeEncoded, codeOffset);

          try {
               FileWriter outputWriter = new FileWriter("output.txt");
               outputWriter.write(finalMessage);
               outputWriter.close();
          } catch (IOException e) {
               System.out.println(e);
          }
     }//end of main
     
     public static String encodeMsg(String message, int codeOffset){
          String encodedMessage = "";

          for (int i = 0; i < message.length(); i++) {
               String currentLetter = message.substring(i, i+1);
               String nextLetter;

               if (alphabet.contains(currentLetter.toUpperCase())) {
                    int newLetter = alphabet.indexOf(currentLetter.toUpperCase())+codeOffset;
                    
                    if (newLetter > alphabet.length()) {
                         newLetter -= (alphabet.length() + 1);
                    }
                    
                    nextLetter = alphabet.substring(newLetter, newLetter+1);
               } else {
                    nextLetter = currentLetter;
               }

               if (Character.isUpperCase(currentLetter.toCharArray()[0])) {
                    nextLetter = nextLetter.toLowerCase();
               }

               encodedMessage = encodedMessage.concat(nextLetter);
          }

          return encodedMessage;
     } //end of encodeMsg
     
     public static Scanner getScanner(String prompt)
     {
          System.out.println(prompt);

          JFileChooser chooser = new JFileChooser(".");
          Scanner fileScanner = null;

          int returnVal = chooser.showOpenDialog(null);
          if (returnVal == JFileChooser.APPROVE_OPTION) {
               try {
                    fileScanner = new Scanner(chooser.getSelectedFile());
               } catch (FileNotFoundException e) {
                    System.out.println(e);
               }
          }

          return fileScanner;
     } //end of getScanner

}//end of class





