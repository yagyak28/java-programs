public class pattern6 {
    public static void main(String[] args)
    {
        int n=10;
        int y=1;
        for(int i=n-1;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
               System.out.print(" ");
            }
            for(int k=n;k>i;k--)
            {
                System.out.print(" "+y);
            }
            y++;
            System.out.println();
        }
    }
    
}
