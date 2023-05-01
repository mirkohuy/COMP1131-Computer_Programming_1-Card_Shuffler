//************************************************
// CardMaker.java
//
// Huy Mirko T00705586
// COMP 1131 Assignment 5 Question 2
// Create a playing card with a customizable suit and rank.
// Supporting class for DeckOfCards class.
//***********************************************

import java.util.Random;

public class CardMaker
{
    // declare variables
    private Random generator = new Random();
    private int cardRankValue;
    private int cardSuitValue;
    private String ranks[] = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Invalid"};
    private String suits[] = {"Diamonds", "Clubs", "Hearts", "Spades", "Invalid"};
    
    // call constructors
    public CardMaker()
    {
        cardRankValue = generator.nextInt(13);
        cardSuitValue = generator.nextInt(4);
    }
    
    public CardMaker(int rank, int suit)
    {
        if (rank < 0 || rank > 12)
        cardRankValue = 14;
        else
        cardRankValue = rank;
        
        if (suit < 0 || suit > 12)
        cardSuitValue = 5;
        else
        cardSuitValue = suit;
    }
    
    // get methods
    public int getRankValue()
    {
        return cardRankValue;
    }

    public String getRankText()
    {
        return ranks[cardRankValue];
    }
    
    public int getSuitValue()
    {
        return cardSuitValue;
    }
    
    public String getSuiteText()
    {
        return suits[cardSuitValue];
    }

    // set methods
    public void setRank(int rank)
    {
        if (rank < 0 || rank > 12)
        cardRankValue = 5;
        else
        cardRankValue = rank;
    }
    
    public void setSuit(int suit)
    {
        if (suit < 0 || suit > 12)
        cardSuitValue = 5;
        else
        cardSuitValue = suit;
    }
    
    // toString method
    public String toString()
    {
        return ranks[cardRankValue] + " of " + suits[cardSuitValue] + "\n";
    }
}
