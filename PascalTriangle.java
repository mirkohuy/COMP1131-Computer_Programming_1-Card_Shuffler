//************************************************
// PascalTriangle.java
//
// Huy Mirko T00705586
// COMP 1131 Assignment 5 Question 3
// Program to output a Pascal triangle based
// on an integer provided by the user.
//***********************************************

import java.util.Scanner;
import java.util.Arrays;

public class PascalTriangle
{
    // Method to loop through user input, call pascalize method, and output results
    public static void output(int num)
    {
        for (int a = 0; a < num; a++)
        {
            int[] array = new int[a + 1];
            for (int b = 0; b <= a; b++)
            {
                array[b] = (pascalize(a, b));
            }
            
            String answer = Arrays.toString(array);
            
            System.out.println(answer);
        }
    }
    
    // method to preform addition recursion
    public static int pascalize(int x, int y)
    {
        if (x == y || y == 0)
            return 1;
        else
        {
            return pascalize(x - 1, y - 1) + pascalize(x - 1, y);
        }
    }

    public static void main (String[] args)
    {
        // introduce program
        System.out.println("Begin process.");
        System.out.print("This program will accept user input n and generate ");
        System.out.println("a Pascal Triangle with n layers");
        
        // declare objects and variables
        Scanner keyboard = new Scanner(System.in);
        
        // store user input
        System.out.print("Please enter a positive interger: ");
        int userInput = keyboard.nextInt();
        
        // check if user input is valid
        if (userInput < 1)
            System.out.println("Invalid input.");
        else
            // call output method
            output(userInput);
                
        // end process
        System.out.print("Process complete.\n\n");
    }
}
