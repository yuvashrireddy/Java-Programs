public class cbv
{
     void value(int a)
    { a=a+5;
        System.out.println("During call n="+a);
     
    }
}
public class callByValue
{
    public static void main(String args[])
    {int n=500;
    
        System.out.println("before call n="+n);
     cbv c=new cbv();
     c.value(n);
    
        System.out.println("Äfter call n="+n);
    }
}
