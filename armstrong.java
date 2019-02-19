public class amstrong
{
    public static void main(String args[])
    {
        int a=153,b=123,temp,sum=0,r;
        boolean tf;
        System.out.println(" Check whether a and b are armstrong number or not \n a=153 \n b=123");
        temp=a;
        while(temp!=0)
        {
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(a==sum)
            tf=true;
        else
        tf=false;
        System.out.println("\n "+a +" = "+tf );
         temp=b;
        while(temp!=0)
        {
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(b==sum)
            tf=true;
        else
        tf=false;
        System.out.println("\n "+b +" = "+tf );
    }
}

