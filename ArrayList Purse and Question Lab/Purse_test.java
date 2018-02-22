import java.util.Scanner;
import java.util.ArrayList;
public class Purse_test
{
    public static void main(String[] args)
    {
        //ArrayList<Coin> pocket= new ArrayList();
        Purse purse = new Purse();
        //adds to the purse
        purse.add(new Coin('q'));
        purse.add(new Coin('q'));
        purse.add(new Coin('q'));
        purse.add(new Coin('q'));
        purse.add(new Coin('q'));
        
        Scanner in = new Scanner(System.in);
        int x = 0;
        while(x==0)
        {
            //menu
            System.out.println("\n ------------------------------------- \n");
            System.out.println(" A- Add a Coin \n R- Remove a Coin \n ?- Display Purse \n E- Exit");
            String choice = in.nextLine();
            System.out.println("\n ------------------------------------- \n");
            if(choice.equals("A"))
            {
                //asks what coin they want to add and adds it to the array
                System.out.println("Add... \n p- penny \n n- nickle \n d- dime \n q- quarter");
                
                String letter = in.nextLine();
                
                if(letter.equals("p"))
                    {
                        purse.add(new Coin('p'));}
                else if(letter.equals("n"))
                    {
                        purse.add(new Coin('n'));}
                else if(letter.equals("d"))
                    {
                        purse.add(new Coin('d'));}
                else if(letter.equals("q"))
                    {
                        purse.add(new Coin('q'));}
            }
            else if(choice.equals("R"))
            {
                //asks what coin they want to remove and removes it from the array
                System.out.println("Remove... \n p- penny \n n- nickle \n d- dime \n q- quarter");
                char rletter = in.next().charAt(0);
                purse.delete(rletter);
            }
            else if(choice.equals("?"))
            {
                System.out.println(purse);
            }
            else if(choice.equals("E"))
            {
                x=1;
            }
        }
    }
}
