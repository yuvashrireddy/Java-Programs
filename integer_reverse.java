import java.util.Scanner;
public class reverseIntegerArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[20];
        int[] b=new int[20];
        System.out.println("Enter the number of values in an array: \n");
        int n=sc.nextInt();
        System.out.println("\n Enter the array values");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            
     System.out.println(a[i]);
        }
        int j=n-1;
      for ( int i =0; i<n;i++,j-- )
     
      {
         b[i]=a[j];
      
      } 
      System.out.println("\n Reverse of array");
      for(int i=0;i<n;i++)
      {
     System.out.println(b[i]);
       }
    }
}
