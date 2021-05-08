import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of values of fibonacci series");
       int n=sc.nextInt();
        int num=0;int num2=1;
        System.out.println(num);
        System.out.println(num2);
       while(n>0)
         {
            int r=num+num2;
             System.out.println(r);
             num=num2;
             num2=r;
             n--;
         }

    }
    
}
