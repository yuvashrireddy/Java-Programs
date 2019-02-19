import java.util.Scanner;
public class sumofArray
{
    public static void main(String args[])
    {
      
        Scanner sc=new Scanner(System.in); 
        int i,n;
        System.out.println("Enter the number of terms in array : ");
        n=sc.nextInt();
        System.out.println("\n Enter the array values :");
        int[] a=new int[20];
        for (i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
  int sum = 0;
      for( i=0;i<n;i++)
      {
          sum = sum+a[i];
      }
      System.out.println("Sum of array elements is:"+sum);
   }
}
