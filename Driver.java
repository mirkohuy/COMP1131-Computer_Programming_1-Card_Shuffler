//************************************************
// Driver.java
//
// Huy Mirko T00705586
// COMP 1131 Assignment 5 Question 2
// Driver for the CardShuffler class.
// Calls methods to output a sorted deck of cards, 
// shuffle the deck, and deal a card.
//***********************************************

public class Driver
{
    public static void main (String[] args)
    {
        // introduction
        System.out.print("Begin process.\n\n");
        
        //declare objects and variables
        DeckOfCards deck = new DeckOfCards();
        
        // call DeckOfCards methods
        System.out.print("Sorted deck:\n\n");
        System.out.print(deck.toString() + "\n\n");
        
        System.out.print("Shuffling deck...\n\n");
        deck.Shuffle();
        
        System.out.print("Dealing cards:\n\n");
        for (int i = 51; i >= 0; i--)
        {
            System.out.println(deck.Deal(i));
        }
        
        // end process
        System.out.print("\nProcess complete.\n");
    }
}
