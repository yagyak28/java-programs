import java.util.Scanner;
public class DecimatoBinary {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a decimal no.");
        int y=ob.nextInt();

        String x="";
        String q="";
        while(y>0)
        {
            int z=y%2;
            y=y/2;
            x=x+z;
        
        }

        int l=x.length();
        for(int i=x.length()-1;i>=0;i--)
        {
           q=q+x.charAt(i);
        }
      System.out.println(q);


    }
    
}
