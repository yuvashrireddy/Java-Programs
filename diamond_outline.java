import java.util.Scanner;
public class D{
	public void space(int s){
		for (int j =1;j<=s;j++) 
            {
                System.out.print(" ");
            }
	}
	public void show(int i){
		for (int j=i;j==i;j++) 
            {
				
                System.out.print(" *\n");                
            }
	}
public static void main(String args[]) 
    { int n, i, j,c=2,s= 1;
        System.out.print("Enter the number of rows:\n ");
        Scanner sc = new Scanner(System.in);
		D ob=new D();
        n = sc.nextInt();
        s= n - 1;
        for (i=1;i<=n;i++) 
        {
            ob.space(s);
            s--;
			if(i==1)
			{
            ob.show(i);
			}
			else{
				System.out.print("*");
				for(j=0;j<c;j++)
				{
                 System.out.print(" ");
				}
				 System.out.println("*");
			}c=c+2;
				
        }
		 s=0;
		 c=n*2;
        for (i=1;i<=n;i++) 
        {
            ob.space(s);
            s++;
			if(i==n)
			{
            ob.show(i);
			}
			else{
				System.out.print("*");
				for(j=c;j>0;j--)
				{
                 System.out.print(" ");
				}
				 System.out.println("*");
			}
				 c=c-2;
        }
	}
}
