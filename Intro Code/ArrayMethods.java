public class ArrayMethods
{
    public static void main (String[] args)
    {
      int [] values = {1,2,3,4,5,6,7,8,9};
      mathy.swap(values);
      mathy.right(values);
      
       for(int i =0; i<values.length; i++)
       {
          System.out.println( values[i] );
        }
    }
}