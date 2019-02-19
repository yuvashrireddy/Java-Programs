import java.util.Scanner;
public class calculator
{
    public static void main(String args[])
    {
      
        Scanner sc=new Scanner(System.in); 
        int a,b,c,n;
        System.out.println("CALCULATOR \n Enter any two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("\nEnter your choice :\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        n=sc.nextInt();
        switch(n)
        {
            case 1:
                c=a+b;
                System.out.println("\n Sum = "+c);break;
            case 2:
                  c=a-b;
                System.out.println("\n Difference = "+c);break;
            case 3:
                  c=a*b;
                System.out.println("\n Product = "+c);break;
            case 4:    
                  c=a/b;
                System.out.println("\n Quotient = "+c);break;
            default:
                System.out.println("\n Invalid choice");
        }
    }
}
