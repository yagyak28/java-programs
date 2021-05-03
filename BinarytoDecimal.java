import java.util.Scanner;
public class BinarytoDecimal {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the binary number");
        int y=ob.nextInt();
        int s=0;
        while(y>0)
        {
            int z=y%10;
         s=s+(int)Math.pow(2,z);
            y=y/10;
        }
        System.out.println(s);
    }
    
}
