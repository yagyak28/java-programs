public class pattern3 {
    
    public static void main( String[] args)
    {
        int n=5;
        int x=65;
        for(int i=1;i<=n;i++)
        {    
            for(int j=1;j<=i;j++)
            {
                char a=(char)x;
                System.out.print(" "+a);
            }
            x++;
            System.out.println();
        }
    }
}
