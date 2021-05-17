import java.util.Scanner;
public class Hcf {
    public static void main(String[] args)
    {
    Scanner ob=new Scanner(System.in);
    System.out.println("enter the numbers");
    int a=ob.nextInt();
    int b=ob.nextInt();
    int ch=0;
    if(a>b)
    {
    ch=a;  
    }
    else 
     ch=b;

    for(int i=ch;i>0;i--)
    {
        if(a%i==0 && b%i==0 )
        {
         System.out.println(i+ " is gcf");
         i=0;
        }
        
       
    }

    }
}
