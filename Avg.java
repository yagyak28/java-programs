import java.util.Arrays;
import java.util.Scanner;
public class Avg {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the length of your array");
        int l=ob.nextInt();

        System.out.println("Enter the elements of the array");
        int[] myArray = new int[l];
        for(int i=0; i<l;i++) {
            myArray[i] = ob.nextInt();
           }
   
         System.out.println(Arrays.toString(myArray));

         int x=0;
         for(int i=0;i<=l-1;i++)
         {
         x=x+myArray[i];
         }
         System.out.println("the sum of array is"+x);
         System.out.println("the avg is"+(x/l) );
    }

    
}
