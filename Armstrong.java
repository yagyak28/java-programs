import java.util.Scanner;
  public class Armstrong {
           public static void main(String[] args) throws Exception {
              Scanner input = new Scanner(System.in);
              int n=0;
              if(input.hasNextInt() ){
                   n= input.nextInt();
              } 
              input.close();
       

        int m=n;
        int s=0;
        while(n>0)
         {
           int x=n%10;
           s=s+(x*x*x);
           n=n/10;
         }
         if(s==m)
         System.out.println("This is an armstrong number");
         else
         System.out.println("This is not an armstrong number");
          
}
}


