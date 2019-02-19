import java.util.*;
import java.lang.*;
import java.io.*;

public class flames{
	public String flamesMin(String f,int suml){
		int fl;
String temp;
fl=f.length();
temp=String.valueOf(f.charAt(suml-1));
			  f=f.replace(temp,""); //cancels the value
			  f=antirotate(f,suml-1);// rotates the value to pursue for the next one
				  return f;
	}
	public String flamesMax(String f,int suml){
		int fl=f.length();
		int d;
		d=suml-fl; // scnd level
		while(d>fl){ // multiple times level
			d=d-fl; 
		}
		String temp;
		temp=String.valueOf(f.charAt(d-1));
		f=f.replace(temp,"");
		 f=antirotate(f,d-1); // rotates
return f;
}
	
	public String antirotate(String s,int n){ //rotation
		String S="";
		int j=0;
		for(int i=0;i<s.length();i++){
			if(j+n==s.length())
			{
				j=0;n=0;
				S=S+s.charAt(j+n);
			j++;}
				else{
					S=S+s.charAt(j+n);
					j++;
			}
		} return S;
	}
		
	public static void main (String[] args) {
		   flames obj=new flames();
		  Scanner sc = new Scanner(System.in);
		  String b,g,temp,f="flames";
    
		  int fl,bl,gl,suml,i,j,c=0;
          System.out.println("Enter the boy's name");
		  b=sc.nextLine().toUpperCase();
		  b=b.replaceAll("\\s", "");
		  System.out.println("Enter the girl's name");
		  g=sc.nextLine().toUpperCase();
		  g= g.replaceAll("\\s", "");
		 fl=f.length();
		  bl=b.length();
		  gl=g.length();
		  suml=bl+gl;
		  for(i=0;i<bl;i++)
			  for(j=0;j<g.length();j++)
		  {
			  if(b.charAt(i)==g.charAt(j)) //checks which characters matches
			  {
				  
		  StringBuilder sb = new StringBuilder(g); // to delete a matching char from girl's name
		  sb.deleteCharAt(j);
		  g=sb.toString();
				  c++; // number of commonolities				  
			  }
		  }
		  suml=suml-(c*2); // commonolities in both the names
		  
		  for(i=0;i<fl-1;i++){ // arranging the flames to cancel
			  
				  if(suml<=f.length())
				  {
				  f=obj.flamesMin(f,suml);} // when commonolities is 4 and f size is 6 [4<=6]
				  else{
				  f=obj.flamesMax(f,suml);} // when c is 8 ,f is 6 [8>6]
		 }
		 if(f.length()==1) // detects the relationship using last value in flames
		 {
				 if(f.charAt(0)=='f')
					 System.out.println("Friends");
				 else if(f.charAt(0)=='l')
					 System.out.println("Lovers");
				 else if(f.charAt(0)=='a')
					 System.out.println("Affection");
				 else if(f.charAt(0)=='m')
					 System.out.println("Marriage");
				 else if(f.charAt(0)=='e')
					 System.out.println("Enemies");
				 else if(f.charAt(0)=='s')
					 System.out.println("Siblings");
		 }
		  
	}
}	
