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

   /**-----------------------------------------------------------------
   *  Sets up the coin by flipping it initially.
   */
   public Coin ()
   {
      flip();
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

   /**-----------------------------------------------------------------
   *  Returns the current face of the coin as a string.
   		@return String
   */
   public String toString()
   {
      String faceName;
      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;
   }
}
