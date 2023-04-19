/**
Print the root of equations of different degree using calculus.
 */
import java.util.*;
public class Calculus
{
   public static void main()
   {
       Scanner sc=new Scanner(System.in);
       int num,deg,co,a,b,c,d,e,f,o,x=1,choice;
       double fx1,f1x,fx2,f2x,fx3,f3x,fx4,f4x,fx5,f5x,fx6,f6x,fx7,f7x,fx8,f8x,fx9,f9x,fx10,f10x,fx11,f11x,fx12,f12x,fx13,f13x,fx14,f14x,fx15,f15x,fx16,f16x,fx17,f17x,fx18,f18x,fx19,f19x,fx20,f20x,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,x15,x16,x17,x18,x19,x20,x20rnd;
       System.out.println("Hey! Welcome to another program. Today I will be calculating the root of \nequation of any degree (upto 5) using Newton's method of Differential Calculus.");
       System.out.println("So let's start without any further ado.");
       System.out.println("The polynomial is in the form of ax^5 + bx^4 + cx^3 + dx^2 + ex + f.");
       System.out.println("Enter the value of coefficient 'a'. Enter '0' if there is no term of power 5.");
       a=sc.nextInt();
       System.out.println("Enter the value of coefficient 'b'. Enter '0' if there is no term of power 4.");
       b=sc.nextInt();
       System.out.println("Enter the value of coefficient 'c'. Enter '0' if there is no term of power 3.");
       c=sc.nextInt();
       System.out.println("Enter the value of coefficient 'd'. Enter '0' if there is no term of power 2.");
       d=sc.nextInt();
       System.out.println("Enter the value of coefficient 'e'. Enter '0' if there is no term of power 1.");
       e=sc.nextInt();
       System.out.println("Enter the value of coefficient 'f'. Enter '0' if there is no constant term.");
       f=sc.nextInt();
       System.out.println("STEP 1:");
       System.out.println("To begin, We make any guess, suppose 1.");
       System.out.println("x ="+x);
       System.out.println("Now we find the derivative denoted by f'(x). The derivative, of a number, say ax^n, is anx^(n-1). \nFor example derivative of 3x^2 = (2*3)x^(2-1) = 6x^1 = 6x .");      
        fx1=(a*Math.pow(x,5))+(b*Math.pow(x,4))+(c*Math.pow(x,3))+(d*Math.pow(x,2))+(e*Math.pow(x,1))+(f*Math.pow(x,0));
       f1x=(5*a)*Math.pow(x,4)+(4*b)*Math.pow(x,3)+(3*c)*Math.pow(x,2)+(2*d)*Math.pow(x,1)+(1*e)*Math.pow(x,0);
       System.out.println("f'(x)="+f1x);
       System.out.println("Then we find the value of equation, denoted by f(x), on assuming x to be 1. Differential calculus \nhas the property that it improves its result after each iteration.");    
       System.out.println("f(x)="+fx1); 
       System.out.println("Now, we find the value of x2 by the formula, x2=x-{f(x)/f'(x)}.");
       x2=x-(fx1/f1x);
       System.out.println("x2 ="+x2);
       System.out.println("We repeat this process a finite number of times (here 20 times). The more number of times we perform this series of steps the better becomes the final result.");
       System.out.println("Press ANY NUMBER EXCEPT 0 to start the process 20 times. Press '0' to exit the program.");
       choice=sc.nextInt();
       if(choice>0)
       {
       System.out.println("STEP 2:");
       fx2=(a*Math.pow(x2,5))+(b*Math.pow(x2,4))+(c*Math.pow(x2,3))+(d*Math.pow(x2,2))+(e*Math.pow(x2,1))+(f*Math.pow(x2,0));
       f2x=(5*a)*Math.pow(x2,4)+(4*b)*Math.pow(x2,3)+(3*c)*Math.pow(x2,2)+(2*d)*Math.pow(x2,1)+(1*e)*Math.pow(x2,0);
       x3=x2-(fx2/f2x);
       System.out.println("x3 ="+x3);
       System.out.println("STEP 3:");
       fx3=(a*Math.pow(x3,5))+(b*Math.pow(x3,4))+(c*Math.pow(x3,3))+(d*Math.pow(x3,2))+(e*Math.pow(x3,1))+(f*Math.pow(x3,0));
       f3x=(5*a)*Math.pow(x3,4)+(4*b)*Math.pow(x3,3)+(3*c)*Math.pow(x3,2)+(2*d)*Math.pow(x3,1)+(1*e)*Math.pow(x3,0);
       x4=x3-(fx3/f3x);
       System.out.println("x4 ="+x4);
       System.out.println("STEP 4:");
       fx4=(a*Math.pow(x4,5))+(b*Math.pow(x4,4))+(c*Math.pow(x4,3))+(d*Math.pow(x4,2))+(e*Math.pow(x4,1))+(f*Math.pow(x4,0));
       f4x=(5*a)*Math.pow(x4,4)+(4*b)*Math.pow(x4,3)+(3*c)*Math.pow(x4,2)+(2*d)*Math.pow(x4,1)+(1*e)*Math.pow(x4,0);
       x5=x4-(fx4/f4x);
       System.out.println("x5 ="+x5);
       System.out.println("STEP 5:");
       fx5=(a*Math.pow(x5,5))+(b*Math.pow(x5,4))+(c*Math.pow(x5,3))+(d*Math.pow(x5,2))+(e*Math.pow(x5,1))+(f*Math.pow(x5,0));
       f5x=(5*a)*Math.pow(x5,4)+(4*b)*Math.pow(x5,3)+(3*c)*Math.pow(x5,2)+(2*d)*Math.pow(x5,1)+(1*e)*Math.pow(x5,0);
       x6=x5-(fx5/f5x);
       System.out.println("x6 ="+x6);
       System.out.println("STEP 6:");
       fx6=(a*Math.pow(x6,5))+(b*Math.pow(x6,4))+(c*Math.pow(x6,3))+(d*Math.pow(x6,2))+(e*Math.pow(x6,1))+(f*Math.pow(x6,0));
       f6x=(5*a)*Math.pow(x6,4)+(4*b)*Math.pow(x6,3)+(3*c)*Math.pow(x6,2)+(2*d)*Math.pow(x6,1)+(1*e)*Math.pow(x6,0);
       x7=x6-(fx6/f6x);
       System.out.println("x7 ="+x7);
       System.out.println("STEP 7:");
       fx7=(a*Math.pow(x7,5))+(b*Math.pow(x7,4))+(c*Math.pow(x7,3))+(d*Math.pow(x7,2))+(e*Math.pow(x7,1))+(f*Math.pow(x7,0));
       f7x=(5*a)*Math.pow(x7,4)+(4*b)*Math.pow(x7,3)+(3*c)*Math.pow(x7,2)+(2*d)*Math.pow(x7,1)+(1*e)*Math.pow(x7,0);
       x8=x7-(fx7/f7x);
       System.out.println("x8 ="+x8);
       System.out.println("STEP 8:");
       fx8=(a*Math.pow(x8,5))+(b*Math.pow(x8,4))+(c*Math.pow(x8,3))+(d*Math.pow(x8,2))+(e*Math.pow(x8,1))+(f*Math.pow(x8,0));
       f8x=(5*a)*Math.pow(x8,4)+(4*b)*Math.pow(x8,3)+(3*c)*Math.pow(x8,2)+(2*d)*Math.pow(x8,1)+(1*e)*Math.pow(x8,0);
       x9=x8-(fx8/f8x);
       System.out.println("x9 ="+x9);
       System.out.println("STEP 9:");
       fx9=(a*Math.pow(x9,5))+(b*Math.pow(x9,4))+(c*Math.pow(x9,3))+(d*Math.pow(x9,2))+(e*Math.pow(x9,1))+(f*Math.pow(x9,0));
       f9x=(5*a)*Math.pow(x9,4)+(4*b)*Math.pow(x9,3)+(3*c)*Math.pow(x9,2)+(2*d)*Math.pow(x9,1)+(1*e)*Math.pow(x9,0);
       x10=x9-(fx9/f9x);
       System.out.println("x10 ="+x10);
       System.out.println("STEP 10:");
       fx10=(a*Math.pow(x10,5))+(b*Math.pow(x10,4))+(c*Math.pow(x10,3))+(d*Math.pow(x10,2))+(e*Math.pow(x10,1))+(f*Math.pow(x10,0));
       f10x=(5*a)*Math.pow(x10,4)+(4*b)*Math.pow(x10,3)+(3*c)*Math.pow(x10,2)+(2*d)*Math.pow(x10,1)+(1*e)*Math.pow(x10,0);
       x11=x10-(fx10/f10x);
       System.out.println("x11 ="+x11);
       System.out.println("STEP 11:");
       fx11=(a*Math.pow(x11,5))+(b*Math.pow(x11,4))+(c*Math.pow(x11,3))+(d*Math.pow(x11,2))+(e*Math.pow(x11,1))+(f*Math.pow(x11,0));
       f11x=(5*a)*Math.pow(x11,4)+(4*b)*Math.pow(x11,3)+(3*c)*Math.pow(x11,2)+(2*d)*Math.pow(x11,1)+(1*e)*Math.pow(x11,0);
       x12=x11-(fx11/f11x);
       System.out.println("x12 ="+x12);
       System.out.println("STEP 12:");
       fx12=(a*Math.pow(x12,5))+(b*Math.pow(x12,4))+(c*Math.pow(x12,3))+(d*Math.pow(x12,2))+(e*Math.pow(x12,1))+(f*Math.pow(x12,0));
       f12x=(5*a)*Math.pow(x12,4)+(4*b)*Math.pow(x12,3)+(3*c)*Math.pow(x12,2)+(2*d)*Math.pow(x12,1)+(1*e)*Math.pow(x12,0);
       x13=x12-(fx12/f12x);
       System.out.println("x13 ="+x13);
       System.out.println("STEP 13:");
       fx13=(a*Math.pow(x13,5))+(b*Math.pow(x13,4))+(c*Math.pow(x13,3))+(d*Math.pow(x13,2))+(e*Math.pow(x13,1))+(f*Math.pow(x13,0));
       f13x=(5*a)*Math.pow(x13,4)+(4*b)*Math.pow(x13,3)+(3*c)*Math.pow(x13,2)+(2*d)*Math.pow(x13,1)+(1*e)*Math.pow(x13,0);
       x14=x13-(fx13/f13x);
       System.out.println("x14 ="+x14);
       System.out.println("STEP 14:");
       fx14=(a*Math.pow(x14,5))+(b*Math.pow(x14,4))+(c*Math.pow(x14,3))+(d*Math.pow(x14,2))+(e*Math.pow(x14,1))+(f*Math.pow(x14,0));
       f14x=(5*a)*Math.pow(x14,4)+(4*b)*Math.pow(x14,3)+(3*c)*Math.pow(x14,2)+(2*d)*Math.pow(x14,1)+(1*e)*Math.pow(x14,0);
       x15=x14-(fx14/f14x);
       System.out.println("x15 ="+x15);
       System.out.println("STEP 15:");
       fx15=(a*Math.pow(x15,5))+(b*Math.pow(x15,4))+(c*Math.pow(x15,3))+(d*Math.pow(x15,2))+(e*Math.pow(x15,1))+(f*Math.pow(x15,0));
       f15x=(5*a)*Math.pow(x15,4)+(4*b)*Math.pow(x15,3)+(3*c)*Math.pow(x15,2)+(2*d)*Math.pow(x15,1)+(1*e)*Math.pow(x15,0);
       x16=x15-(fx15/f15x);
       System.out.println("x16 ="+x16);
       System.out.println("STEP 16:");
       fx16=(a*Math.pow(x16,5))+(b*Math.pow(x16,4))+(c*Math.pow(x16,3))+(d*Math.pow(x16,2))+(e*Math.pow(x16,1))+(f*Math.pow(x16,0));
       f16x=(5*a)*Math.pow(x16,4)+(4*b)*Math.pow(x16,3)+(3*c)*Math.pow(x16,2)+(2*d)*Math.pow(x16,1)+(1*e)*Math.pow(x10,0);
       x17=x16-(fx16/f16x);
       System.out.println("x17 ="+x17);
       System.out.println("STEP 17:");
       fx17=(a*Math.pow(x17,5))+(b*Math.pow(x17,4))+(c*Math.pow(x17,3))+(d*Math.pow(x17,2))+(e*Math.pow(x17,1))+(f*Math.pow(x17,0));
       f17x=(5*a)*Math.pow(x17,4)+(4*b)*Math.pow(x17,3)+(3*c)*Math.pow(x17,2)+(2*d)*Math.pow(x17,1)+(1*e)*Math.pow(x10,0);
       x18=x17-(fx17/f17x);
       System.out.println("x18 ="+x18);
       System.out.println("STEP 18:");
       fx18=(a*Math.pow(x18,5))+(b*Math.pow(x18,4))+(c*Math.pow(x18,3))+(d*Math.pow(x18,2))+(e*Math.pow(x18,1))+(f*Math.pow(x18,0));
       f18x=(5*a)*Math.pow(x18,4)+(4*b)*Math.pow(x18,3)+(3*c)*Math.pow(x18,2)+(2*d)*Math.pow(x18,1)+(1*e)*Math.pow(x10,0);
       x19=x18-(fx18/f18x);
       System.out.println("x19 ="+x19);
       System.out.println("STEP 19:");
       fx19=(a*Math.pow(x19,5))+(b*Math.pow(x19,4))+(c*Math.pow(x19,3))+(d*Math.pow(x19,2))+(e*Math.pow(x19,1))+(f*Math.pow(x19,0));
       f19x=(5*a)*Math.pow(x19,4)+(4*b)*Math.pow(x19,3)+(3*c)*Math.pow(x19,2)+(2*d)*Math.pow(x19,1)+(1*e)*Math.pow(x19,0);
       x20=x19-(fx19/f19x);
       System.out.println("x20 ="+x20);
       x20rnd=Math.round(x20*10000000.0)/10000000.0;
       System.out.println("A very close approximation rounded off to 7 decimal places (suitable for all practical purposes) \nof the value of 'x' that satisfies the equation is ="+x20rnd);
       System.out.println("Thank You !!");
       System.exit(0);
    }
    else
    {
    System.out.println("Feeling sad for your'e leaving so soon. Nevertheless, bye-bye.");
    System.exit(0);
    }
    }
}
