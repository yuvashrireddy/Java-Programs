import java.util.*;
public class test
{
    public static void main(String args[])
    {
        Map m=new HashMap();
        m.put("5","RAJ");
        m.put("2","ARUN");
        m.put("3","KRISHNA");
        m.put("4","SANJU");
        System.out.println(m);
        Collection c=m.values();
        Set s1=m.keySet();
        Set s2=m.entrySet();
        
        System.out.println(s1);
        System.out.println(s2);
        
    }
}

