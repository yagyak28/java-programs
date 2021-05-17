import java.util.Scanner;
 public class Grades {
    public static void main(String[] args)
    {
   Scanner ob= new Scanner(System.in);
   int ykas=ob.nextInt();

   if(ykas>=90 && ykas<=100)
    System.out.println("A");
    else if(ykas>=80 && ykas<90)
    System.out.println("B");
    else if(ykas>=70 && ykas<80)
    System.out.println("C");
    else if(ykas>=60 && ykas<70)
    System.out.println("D");
    else
     System.out.println("vishudh chutiye ho tum par koi na with red heart");

    }
    
}
