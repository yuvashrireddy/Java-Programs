import java.util.Arrays; 
public class sort
{
public static void main(String[] args)
{  
    int[] my_array1 = {12,13,10,16,2,9,7,3,4,1,6,8,5,0,11}; 
    String[] my_array2 = {
            "Java",
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };        
    System.out.println("Original numeric array : "+Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Sorted numeric array : "+Arrays.toString(my_array1));
    
    System.out.println("Original string array : "+Arrays.toString(my_array2));
    Arrays.sort(my_array2);
    System.out.println("Sorted string array : "+Arrays.toString(my_array2));
    }
}
