import java.util.Scanner;
import java.util.Arrays;
public class Bubblesort {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of an array");
    int l=sc.nextInt();
    System.out.println("Enter the elements of an array");
    int[] myarray=new int[l];
    for(int i=0;i<l;i++)
    {
        myarray[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(myarray));
  
    for(int i=0;i<l-1;i++)                  
    {
        for(int j=0;j<l-i-1;j++)
        { 
       if(myarray[j]>myarray[j+1])
       {
           int x=myarray[j+1];
           myarray[j+1]=myarray[j];
           myarray[j]=x;
       }
       
    }
    
}
System.out.println(Arrays.toString(myarray));
}
}
