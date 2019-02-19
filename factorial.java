import java.util.Scanner;
public class factorial
{
   
    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);  
    int n,i,fact=1;
 
   System.out.println("Enter a number:");  
   n=sc.nextInt();
        System.out.println(n);
        for(i=n;i>0;i--)
        {
            fact=fact*n;
        }
        System.out.println("\n The factorial of "+n+ "is \n"+n+"!=" +fact);
        
    }
}
