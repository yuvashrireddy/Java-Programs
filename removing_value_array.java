import java.util.Arrays; 
public class remArray
{
public static void main(String[] args) {
   int[] a = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
   System.out.println("Original Array : "+Arrays.toString(a));     
   
   int removearray= 1;

   for(int i = removearray; i < a.length -1; i++){
        a[i] = a[i + 1];
      }
    System.out.println("After removing the second element: "+Arrays.toString(a));
 }
 }
