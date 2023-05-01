//************************************************
// DeckOfCards.java
//
// Huy Mirko T00705586
// COMP 1131 Assignment 5 Question 2
// Supporting class for the driver. This program
// has methods to create an array of card objects,
// shuffle the array, and deal a card.
//***********************************************
 
import java.util.Random;
import java.util.Arrays;

public class DeckOfCards
{
    // declare variables
    private final int DECKSIZE = 52;
    private CardMaker[] myDeck;
    private CardMaker temp;
    
    // call constructors
    public DeckOfCards()
    {
        myDeck = new CardMaker[DECKSIZE];
        
        int countDeck = 0;
        
        for (int countSuit = 0; countSuit < 4; countSuit++)
        {
            for (int countRank = 0; countRank < 13; countRank++)
            {                
                myDeck[countDeck] = new CardMaker(countRank, countSuit);
                
                countDeck++;
            }
        }
    }
    
    // method to shuffle deck
    public String Shuffle()
    {
        Random generator = new Random();
        temp = new CardMaker(5, 5);
        
        for (int i = DECKSIZE - 1; i > 0; i--)
        {
            int j = generator.nextInt(i + 1);
            
            temp = myDeck[i];
            myDeck[i] = myDeck[j];
            myDeck[j] = temp;
        }
        return Arrays.toString(myDeck);
    }
    
    // method to deal a card and show countdown
    public String Deal(int index)
    {
        return myDeck[index] + "..." + index + " card(s) remaining.";
    }
    
    // toString method
    public String toString()
    {
        return Arrays.toString(myDeck);
    }
}
