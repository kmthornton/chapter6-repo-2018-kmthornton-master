/**
*  Edit class to fullfill Purse Requirements
*
*  Represents a coin with two sides that can be flipped.
*/

import java.util.Random;

public class Coin
{
   private final int HEADS = 0;
   private final int TAILS = 1;

   private int face;
   private double amount;
   private char type;
   private double value;

   /**-----------------------------------------------------------------
   *  Sets up the coin by flipping it initially.
   */
   public Coin (char coin)
   {
      type = coin;
      if(type== 'p')
      value=0.01;
      if(type=='n')
      value=0.05;
      if(type=='d')
      value=0.10;
      if(type=='q')
      value=0.25;
      //flip();
   }

   /**-----------------------------------------------------------------
   *  Flips the coin by randomly choosing a face value.
   */
   public void flip ()
   {
      face = (int) (Math.random() * 2);
   }

   /**-----------------------------------------------------------------
   *  Returns true if the current face of the coin is heads.
        @return boolean, true if heads
   */
   public boolean isHeads ()
   {
      return (face == HEADS);
   }
   
   /**
    * returns the type of coin as a char
    */
   public char getType()
   {
       return this.type;
    }
    
   /**
    * returns the ammount of the coin
    */
   public double getValue()
   {
       return this.value;
    }

   /**-----------------------------------------------------------------
   *  Returns the current face of the coin as a string.
        @return String
   */
   public String toString()
   {
      String faceName = "";
      /**
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";
         */
      if(type == 'p')
      faceName += "Penny";
      else if(type == 'n')
      faceName += "Nickle";
      else if(type == 'd')
      faceName += "Dime";
      else if(type == 'q')
      faceName += "Quarter";
      
      faceName += " " + this.value;
      return faceName;
   }
}
