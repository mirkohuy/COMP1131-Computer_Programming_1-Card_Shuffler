//************************************************
// RandomArray.java
//
// Huy Mirko T00705586
// COMP 1131 Assignment 5 Question 1
// Driver program for the RandomArray supporting class.
// Requests user input and calls the RandomArray methods.
//***********************************************

import java.util.Scanner;

public class DriverRandomArray
{
    public static void main (String[] args)
    {
        // declare objects and variables
        Scanner keyboard = new Scanner(System.in);
        
        // introduce the program
        System.out.println("Process begin.");
        System.out.println("This program will generate an array with size equal to an interger entered by the user.");
        System.out.print("It will also output the minimum value, maximum value, and average value of the array.\n");
        
        // get user input
        System.out.print("Enter an interger greater than zero: ");
        int userInput = keyboard.nextInt();
        
        // check for valid input, then call supporting methods
        if (userInput > 0)
        {
            RandomArray userArray = new RandomArray(userInput);
            System.out.println("Minimum value: " + userArray.getMin());
            System.out.println("Maximum value: " + userArray.getMax());
            System.out.println("Average value: " + userArray.getAverage());
            System.out.println("String representation: " + userArray.toString());
        }
        else
        {
            System.out.println("Invalid input.");
        }
                
        // End process
        System.out.print("Process complete\n\n");
    }
}
