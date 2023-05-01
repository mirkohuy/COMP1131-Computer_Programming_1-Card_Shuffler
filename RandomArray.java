//************************************************
// RandomArray.java
//
// Huy Mirko T00705586
// COMP 1131 Assignment 5 Question 1
// Recieves input from main program and generates an array equal to the
// size of the input. Also populates the array with random numbers
// and returns max value, min value, average value and string
// representation.
//***********************************************

import java.util.Random;
import java.util.Arrays;
import java.text.DecimalFormat;

public class RandomArray
{
    // declare variables
    private Random generator = new Random();
    private DecimalFormat fmt = new DecimalFormat("0.###");
    private int[] userArray;
    private double total;
    
    // call constructor
    public RandomArray(int userInput)
    {
        userArray = new int[userInput];
        for (int count = 0; count < userArray.length; count++)
        {
            userArray[count] = generator.nextInt(userArray.length + 1);
        }
        
    }
    
    // get methods
    public int getMin()
    {
        int min = userArray[0];
        
        for (int count = 0; count < userArray.length; count++)
        {
            if (userArray[count] < min)
               min = userArray[count]; 
        }
        
        return min;
    }
    
    public int getMax()
    {
        int max = userArray[0];
        
        for (int count = 0; count < userArray.length; count++)
        {
            if (userArray[count] > max)
               max = userArray[count]; 
        }
        
        return max;
    }
    
    public String getAverage()
    {
        for (int count = 0; count < userArray.length; count++)
        {
            total = total + userArray[count];
        }
        
        String average = fmt.format(total / userArray.length);
        
        return average;
    }
    
    // toString method
    public String toString()
    {   
        String userString = Arrays.toString(userArray);
        return userString;
    }
}
