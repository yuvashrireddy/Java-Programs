import java.util.Scanner;
public class largerarray
{
    public static void main(String args[])
    {
        int al1,bl1;
        Scanner sc=new Scanner(System.in); 
        String a,b;
        a=sc.nextLine();
        b=sc.nextLine();
        al1=a.length();
        bl1=b.length();
        if(al1>bl1)
         System.out.println("\n The larger of two arrays is "+a);
        else
        System.out.println("\n The larger of two arrays is "+b);
     

    }
}
