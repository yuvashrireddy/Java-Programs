import java.util.Scanner;
public class reverseArray
{
    public static void main(String args[])
    {
      
        Scanner sc=new Scanner(System.in); 
        int j,i,n;
        System.out.println("Enter the number of terms in array : ");
        n=sc.nextInt();
        System.out.println("\n Enter the array values :");
        int[] a=new int[20];
         System.out.println("\n Original Array");
        for (i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
         System.out.println(a[i]);
        }
          j = i - 1;     // now j will point to the last element
       i = 0;         // and i will point to the first element
	   
       while(i<j)
       {
         int temp = a[i];
           a[i] = a[j];
           a[j] = temp;
           i++;
           j--;
       }
       
         System.out.println("\n Reversed Array");
        for(i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
    }
}
