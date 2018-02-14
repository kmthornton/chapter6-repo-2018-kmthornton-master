public class warmup
{
    public static void main(String[] args)
    {
        int [] list = new int[10];
        for (int i=0 ; i<=9 ; i++)
        {
            if(i==0)
             list[i] = 17;
            else if(i==9)
             list[i] = 29;
            else
             list[i]=-1;
            
            list[i] += -1;
            System.out.println(list[i]);
        }
        for (int i=0 ; i<=9 ; i++)
        {
            System.out.print(list[i]+",");
        }
    }
}
        