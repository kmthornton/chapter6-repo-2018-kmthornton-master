import java.util.Scanner;
import java.util.ArrayList;
public class Purse_test
{
    public static void main(String[] args)
    {
        //ArrayList<Coin> pocket= new ArrayList();
        Purse purse = new Purse();
        //adds to the purse
        Coin q = new Coin('q');
        purse.add(q);
        purse.add(q);
        purse.add(q);
        purse.add(q);
        purse.add(q);
        
        Scanner in = new Scanner(System.in);
        int x = 0;
        while(x==0)
        {
            //menu
            System.out.println(" A- Add a Coin \n R- Remove a Coin \n ?- Display Purse \n E- Exit");
            String choice = in.nextLine();
            if(choice.equals("A"))
            {
                //asks what coin they want to add and adds it to the array
                System.out.println("Add... \n p- penny \n n- nickle \n d- dime \n q- quarter");
                
                String letter = in.nextLine();
                
                //creates a new coin
                Coin newcoin = new Coin('p');
                if(letter == "p")
                    {
                        purse.add(newcoin);}
                else if(letter == "n")
                    {newcoin = new Coin('n');
                        purse.add(newcoin);}
                else if(letter == "d")
                    {newcoin = new Coin('d');
                        purse.add(newcoin);}
                else if(letter == "q")
                    {newcoin = new Coin('q');
                        purse.add(newcoin);}
            }
            else if(choice.equals("R"))
            {
                //asks what coin they want to remove and removes it from the array
                System.out.println("Remove... \n p- penny \n n- nickle \n d- dime \n q- quarter");
                String rletter = in.nextLine();
                //char rletter;
                //rletter = in.next().charAt(0);
                Coin rcoin = new Coin('p');
                if(rletter == "p")
                    purse.remove(rcoin);
                else if(rletter == "n")
                {rcoin = new Coin('n');
                    purse.remove(rcoin);}
                else if(rletter == "d")
                {rcoin = new Coin('d');
                    purse.remove(rcoin);}
                else if(rletter == "q")
                {rcoin = new Coin('q');
                    purse.remove(rcoin);}
                
            }
            else if(choice.equals("?"))
            {
                System.out.println(purse);
            }
            else if(choice.equals("E"))
            {
                x=1;
            }
            else
            {
                System.out.println("Incorrect input");
            }
        }
    }
}
