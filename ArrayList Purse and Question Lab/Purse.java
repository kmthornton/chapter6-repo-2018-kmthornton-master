
import java.util.ArrayList;

public class Purse
{
    private ArrayList<Coin> pocket= new ArrayList();


    public Purse (){};

    public Purse (Coin acoin)
    {
        pocket.add(acoin);
    }
    /** precondition: Coin will be initialized (value and name) correctly
    *               each variable will have a value
        postcondition: Puts the Coin into the array list change
    */
     public void add (Coin acoin)
    {
        pocket.add(acoin);
    }
    /**
     * returns the length of the object as an int
     */
    public int getLength()
    {
        int count=0;
        for(int i=0; i<pocket.size() ; i++)
        {
            count+=1;
        }
        return count;
    }
    /**(
     * removes a coin
     */
    public void remove(Coin acoin)
    {
        pocket.remove(acoin);
    }
  
    /**
     * Gets the number of dimes 
     * returns a int
     */
    public int getNumberofDimes()
    {
        int dcount=0;
        for(int i=0; i<pocket.size() ; i++)
        {
            if(pocket.get(i).getType() == 'd')
            dcount+=1;
        }
        return dcount;
    }
        /**
     * Gets the number of pennys 
     * returns a int
     */
    public int getNumberofPenny()
    {
        int pcount=0;
        
        for(int i=0; i<pocket.size() ; i++)
        {
            if(pocket.get(i).getType() == 'p')
            pcount+=1;
        }
        return pcount;
    }
        /**
     * Gets the number of nickels 
     * returns a int
     */
    public int getNumberofNickels()
    {
        int ncount=0;
        for(int i=0; i<pocket.size() ; i++)
        {
            if(pocket.get(i).getType() == 'n')
            ncount+=1;
        }
        return ncount;
    }
        /**
     * Gets the number of quarters
     * returns a int
     */
    public int getNumberofQuarters()
    {
        int qcount=0;
        for(int i=0; i<pocket.size() ; i++)
        {
            if(pocket.get(i).getType() == 'q')
            qcount+=1;
        }
        return qcount;
    }

  /** Returns the total value of the coins in the array
  *                 list change
        @return double 
  */
    public double getTotal()
    {
        double total = 0;
        for(int i = 0; i<pocket.size() ; i++)
        {
            total += pocket.get(i).getValue();
        }

        return total;

    }



 /**
 *  Returns the all objects in the array list as Strings
 */

   public String toString()
   {
      String theString = getNumberofPenny()+" Penny	    .01 \n";
      theString += getNumberofNickels()+" Nickles   .05 \n";
      theString += getNumberofDimes()+" Dimes     .10 \n";
      theString+= getNumberofQuarters()+" Quarters  .25 \n";
      theString+= "Total : " + getTotal();
      return theString;
   }

}
//end of purse
