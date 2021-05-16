import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args)
    {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the year");
  int y=sc.nextInt();
   
     if(y%4==0)
     System.out.println("Is a leap year");
     else
     System.out.println("Is not a leap year");
    }
    }
