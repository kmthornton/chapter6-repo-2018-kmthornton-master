//********************************************************************
//  Account.java       Author: Lewis/Loftus/Cocking
//
//  Represents a bank account with basic services such as deposit
//  and withdraw.
//********************************************************************

import java.text.NumberFormat;

public class Account implements Comparable
{
   private NumberFormat fmt = NumberFormat.getCurrencyInstance();

   private final double RATE = 0.035;  // interest rate of 3.5%

    private boolean locked_obj = false;
    private int password = 54321;

   private int acctNumber;
   private double balance;
   private String name;
   private int type; //1- savings, 2 - checking, 2 - other

   //-----------------------------------------------------------------
   //  Sets up the account by defining its owner, account number,
   //  and initial balance.
   //-----------------------------------------------------------------
   public Account (String owner, int account, double initial, int type)
   {
      name = owner;
      acctNumber = account;
      balance = initial;
      this.type = type;
   }

   //-----------------------------------------------------------------
   //  Validates the transaction, then deposits the specified amount
   //  into the account. Returns the new balance.
   //-----------------------------------------------------------------
   public double deposit (double amount)
   {
      if(locked_obj)
      {
          System.out.println("access is denied--foo");
          return 0;
      }
          if (amount < 0)  // deposit value is negative
          {
             System.out.println ();
             System.out.println ("Error: Deposit amount is invalid.");
             System.out.println (acctNumber + "  " + fmt.format(amount));
          }
          else
             balance = balance + amount;
          return balance;



   }

   //-----------------------------------------------------------------
   //  Validates the transaction, then withdraws the specified amount
   //  from the account. Returns the new balance.
   //-----------------------------------------------------------------
   public double withdraw (double amount, double fee)
   {
       if (locked_obj)
       {
           System.out.println("access denied foo");
           return 0;
       }
            amount += fee;

            if (amount < 0)  // withdraw value is negative
            {
             System.out.println ();
             System.out.println ("Error: Withdraw amount is invalid.");
             System.out.println ("Account: " + acctNumber);
             System.out.println ("Requested: " + fmt.format(amount));
            }
            else
             if (amount > balance)  // withdraw value exceeds balance
             {
                System.out.println ();
                System.out.println ("Error: Insufficient funds.");
                System.out.println ("Account: " + acctNumber);
                System.out.println ("Requested: " + fmt.format(amount));
                System.out.println ("Available: " + fmt.format(balance));
             }
             else
                balance = balance - amount;

            return balance;
   }

   //-----------------------------------------------------------------
   //  Adds interest to the account and returns the new balance.
   //-----------------------------------------------------------------
   public double addInterest ()
   {
      balance += (balance * RATE);
      return balance;
   }

   //-----------------------------------------------------------------
   //  Returns the current balance of the account.
   //-----------------------------------------------------------------
   public double getBalance ()
   {
      return balance;
   }

   //-----------------------------------------------------------------
   //  Returns the account number.
   //-----------------------------------------------------------------
   public int getAccountNumber ()
   {
      return acctNumber;
   }

   //-----------------------------------------------------------------
   //  Returns a one-line description of the account as a string.
   //-----------------------------------------------------------------
   public String toString ()
   {
      return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
   }

     //lockable methods----------------------------
      //  This is the section to implement interface lockable
      //-----------------------------------------------------------------
     public void setkey (int pass)
     {
        password = pass;
     }

     public void lock ( int locker)
     {
         if (locker == password)
            locked_obj = true;

     }
     public void unlock(int unlocker)
     {
        if (unlocker == password)
            locked_obj = false;
     }

    public boolean locked ()
    {
        return locked_obj;
    }

    //Comparable methods----------------------------
          //  This is the section to implement interface Comparable
          // it compares the acctNumber
            //-----------------------------------------------------------------
    public int compareTo (Object o)
    {
       Account a = (Account)o;
       

       return acctNumber-a.acctNumber;
    }
    
    /**
     * makes a hash code by adding the account number, type, and first two chars of the name
     */

    public void hash_code()
    {
        int hash_num = 0;
        int temp = 0;
        
        //adds up the account number, account type, and two chars from the name
        hash_num += acctNumber + type + name.charAt(0) + name.charAt(1);
        
        //adjusts hash number to be 8 digits
        hash_num = (hash_num % 2000000000) * 272955;
        hash_num = hash_num % 100000000;
        


        acctNumber = hash_num;
    }
    
        /**
     * Compares two objects priorities
     * Returns a positive if its greater than 
     * Negative if less than
     * Zero if equal
     */
    public double compareTo(Account obj)
    {
        return this.acctNumber - obj.acctNumber;
    }
    
    /**
   *  Sorts the specified array of objects using the insertion
   *  sort algorithm.
   */
   public static void insertionSort (Account[] objects)
   {
      for (int index = 1; index < objects.length; index++)
      {
         Account key = objects[index];
         int position = index;

         // shift larger values to the right
         while (position > 0 && objects[position-1].compareTo(key) > 0)
         {
            objects[position] = objects[position-1];
            position--;
         }

         objects[position] = key;
      }
   }






}
