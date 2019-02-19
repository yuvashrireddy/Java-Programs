import java.util.Scanner;
public class copyarray
{
    public static void main(String args[])
    {
      
        Scanner sc=new Scanner(System.in); 
        int a[20],b[20],i,n;
        System.out.println("Enter the number of terms in array : ");
        n=sc.nextInt();
        System.out.println("\n Enter the array values :");
        for (i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
         for (i=0;i<n;i++)
        {
        b[i]=a[i];
        }
        System.out.println("\n Array 1 values ");
        for(i=0;i<n;i++)
        {
          System.out.println("\t"+a[i]);
        }
        System.out.println("\n Array 2 values ");
        for(i=0;i<n;i++)
        {
          System.out.println("\t"+b[i]);
        }
    }
}
