import java.util.Scanner;
public class palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a,b="";
        System.out.println("Enter a string value: \n");
        a=sc.nextLine();
        System.out.println(a);
     int length = a.length();
 
      for ( int i = length - 1; i >= 0; i-- )
      {
         b = b + a.charAt(i);
      }
      if (a.equals(b))
         System.out.println(a +" is a palindrome");
      else
         System.out.println(a +" is not a palindrome");
 
        
    }
}
