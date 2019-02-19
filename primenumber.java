import java.util.Scanner;  
public class PrimeNumber
{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);  
    int i,n; 
    boolean f=false;
   System.out.println("Enter a number:");  
   n=sc.nextInt(); 
   for(i=2;i<n;i++)
   {
       if(n%i==0)
       f=true;
   }
   if(f==true)
   System.out.println("\n "+n+" is a not prime number");
   else
   System.out.println("\n"+n+" is a prime number");
 }  
}  
