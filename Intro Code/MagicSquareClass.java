//Kyle Thornton
public class MagicSquareClass
{
       private int [] [] square;
       public MagicSquareClass(int[][] array)
        {
            square = array;
        }
            
       public void setMagicSquare(int [][] array)
        {
           square = array;

        }
        
        /**
         * Returns the magic number as an int
         * only adds up the first row because if any of the 
         * other rows or collumns are different it doesnt matter
         */
        public int getMagicNum(int [][] arr)
        {
                
                int magicnum = 0;
                for(int row=0; row<arr.length; row++)
                {
                    int rtotal = 0;
                    for(int num=0; num<arr.length; num++)
                    {   //gets the total of the first row
                        if(row==0)
                        magicnum+=arr[row][num];
                    }
                }
                return magicnum;
        }
        
        /**
         * checks the rows, columns, and diagonals to see if they
         * are equal
         */
        public boolean isMagic(int[][] arr)
        {
            int magicnum = 0;
            boolean magic = true;
            //adds all the rows
            for(int row=0; row<arr.length; row++)
            {
                int rtotal = 0;
                int ctotal = 0;
                //checks rows
                for(int num=0; num<arr.length; num++)
                {
                    rtotal += arr[row][num];
                    if(row==0)
                    magicnum+=arr[row][num];
                }
                //checks that the row total equals the first row total
                 if(rtotal != magicnum)
                {   //stops the loop
                    row = arr.length;
                    magic = false;}
                //checks columns
                if(magic)
                {
                    for(int col=0; col<arr.length; col++)
                    {
                        ctotal += arr[col][row];
                    }
                }
                if(ctotal != magicnum)
                {   row = arr.length;
                    magic = false;}
            }
            //checks diagonal going right
            if (magic)
            {
                   int dtotal=0;
                   int row = 0;
                   for(int col=0; row<arr.length; col++, row++)
                   {
                       dtotal+=arr[row][col];
                   }
                   if(dtotal != magicnum)
                   magic = false;
                }
            
            //checks diagonal going left
                if (magic)
            {
                   int dtotal2=0;
                   int row = 0;
                   for(int col=arr.length -1; col>=0; col--, row++)
                   {
                       dtotal2+=arr[row][col];
                }
                if(dtotal2 != magicnum)
                   magic = false;
            }
                return magic;
        }
    }