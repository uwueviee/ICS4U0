package Assignment1;//import java.io.*;
import java.util.Scanner;

public class Prompt
{
    private static final Scanner in = new Scanner(System.in);
    //
    // Reads console input and checks if it is the correct type (int)
    //
    public static int getInt(String prompt)
    {
        //
        // Loop until a valid entry is received
        //
        while(true)
        {
            //
            // Get input
            //
            System.out.println(prompt);

            //
            // Check if it is an integer
            //
            if(Prompt.in.hasNextInt())
            {
                // Integer inputted, return result
                int answer = Prompt.in.nextInt();
                Prompt.in.nextLine();
                return answer;
            }
            else
            {
                // Invalid data type entered
                String input = Prompt.in.nextLine();
                System.out.println("Error:" + input + " is not an integer.");
            }
        }
    }

    // Code to test class

    public static void main(String[] args) {

        int testIntInput = 0;

        testIntInput = Prompt.getInt("Enter an integer");
        System.out.printf("%d was input %n", testIntInput);


    }
}