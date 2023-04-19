/**
 3x+1
 */
import java.util.*;
public class Veritasium
{
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       int count=0;
       long num,newnum,large,small;
       System.out.println("Enter the number.");   
       num=sc.nextLong();
       large=num;
       small=num;
       System.out.print("The numbers are: "+num);
       while(num!=1)
       {
        if(num%2==0)        
        newnum=num/2;
        else
        newnum=(3*num)+1;
        if(newnum>large)
        large=newnum;
        else
        small=newnum;
        count++;      
        System.out.print(", "+newnum);        
        num=newnum;
       }
       System.out.println(".");       
       System.out.println("COUNT = "+count);
       System.out.println("LARGEST = "+large);
       System.out.println("SMALLEST = "+small);
    }
}
