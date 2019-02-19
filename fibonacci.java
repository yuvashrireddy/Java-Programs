public class Fibonacci
{
public static int fib(int n)
{
      if (n == 0)
          return 0;
         else if (n == 1) 
            return 1;
         else 
            return fib(n-1) + fib(n-2); 
}


    public static void main(String args[])
    {
        System.out.println("FIBONACCI SERIES :");
         for(int i=0; i < 25; i++)
         {
                if(fib(i)>=200)
             break;
            System.out.println( fib(i));
           
        }
    }
}

