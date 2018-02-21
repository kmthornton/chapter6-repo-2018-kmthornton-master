
public class AccountTest
{
    public static void main(String args[])
    {
        //creates a new account
        Account p1 = new Account ("Homer Simpson" ,0001, 1090.45, 2);
        Account p2 = new Account ("Megan Brimstead", 0002, 786.54, 1);
        Account p3 = new Account ("Karri Meirey", 1564, 4571.60, 2);
        Account p4 = new Account ("Liz Wilson", 1349, 2034.52, 1);
        Account p5 = new Account ("Jack Hagested", 2389, 280.67 , 2);
        Account p6 = new Account ("Bill Hagested", 2391, 1008.53, 1);
        Account p7 = new Account ("Emy Hayes", 3598, 1260.84, 2);
        Account p8 = new Account ("Eric Willhelm", 3208, 3420.75 , 1);
        Account p9 = new Account ("Megan MulCahey", 4568, 9041.49, 1);
        
        Account[] people = {p1,p2,p3,p4,p5,p6,p7,p8,p9}; //SORT THIS AND PRINT THIS USING SORTS CLASS
        
        //prints the accounts with a new hash code as their account number
        for(int i = 0 ; i<people.length; i++)
        {
            people[i].hash_code();
            System.out.println(people[i]);
        }
        
        Account[][]hashTable = new Account[20][2];
        
        //sorts the accounts into the array hashTable
        for(int q = 0 ; q<people.length; q++)
        {
            if(hashTable[people[q].getAccountNumber()%20][0] == null)
            hashTable[people[q].getAccountNumber()%20][0] = people[q];
            
            //if the first row of the array is filled the account is moved to the second row
            //to avoid collision
            else
            hashTable[people[q].getAccountNumber()%20][1] = people[q];
        }
        
        //prints out the hashTable
        for(int w = 0; w < hashTable.length; w++){
            System.out.println(hashTable[w][0]);
            System.out.println(hashTable[w][1]);
            System.out.println("\n");
            
        }
    }
}