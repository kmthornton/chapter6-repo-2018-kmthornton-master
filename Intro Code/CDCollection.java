//********************************************************************
//  CDCollection.java       Author: Lewis/Loftus/Cocking
//
//  Represents a collection of compact discs.
//********************************************************************

import java.text.NumberFormat;
import java.util.ArrayList;

public class CDCollection
{
   private ArrayList collection;
   private int count;
   private double totalCost;

   /**
   *  Creates an initially empty collection.
   */
   public CDCollection ()
   {
      ArrayList collection = new ArrayList<>(100);
      count = 0;
      totalCost = 0.0;
   }

   /**
   *  Adds a CD to the collection, keeping list in order according to
      rating.
   *  @param
   */
   public void addCD (String title, String artist, double cost,
                      int tracks)
   {// must rewrite this method!!!!!!!!!
      //if (count == collection.size())
        // increaseSize();

      collection.add(new CD (title, artist, cost, tracks));
      totalCost += cost;
      count++;
   }

   /**
   *  Returns a report describing the CD collection.
   */
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();
      String report = "******************************************\n";
      report += "My CD Collection\n\n";

      report += "Number of CDs: " + count + "\n";
      report += "Total cost: " + fmt.format(totalCost) + "\n";
      report += "Average cost: " + fmt.format(totalCost/count);

      report += "\n\nCD List:\n\n";


      for (int cd = 0; cd < count; cd++)
         report += collection.get(cd) + "\n";

      return report;
   }
   /**
    * Removes a cd
    */
   public void removeCD(String CDName)
   {
    for(int i = 0; i<collection.size() ; i++)
    {
        System.out.print(collection.get(i));
        if(CDName == collection.get(i))
        {}
    }
    }
   /*
   //-----------------------------------------------------------------
   //  Doubles the size of the collection by creating a larger array
   //  and copying the existing collection into it.
   //-----------------------------------------------------------------
   private void increaseSize ()
   {
      CD[] temp = new CD[collection.length * 2];

      for (int cd = 0; cd < collection.length; cd++)
         temp[cd] = collection[cd];

      collection = temp;
   }
   */
}







