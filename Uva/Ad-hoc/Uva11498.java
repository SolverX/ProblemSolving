
import java.io.*;
import java.util.*;
/**
 *
 * @author SolverX
 */
public class Uva11498{
    public static void main(String args[])
    {
       Scanner sc= new Scanner(System.in);
       int n;
       while(true)
       {
           n = sc.nextInt();
           if(n==0)
               break;
           int x,y;
           x=sc.nextInt();
           y=sc.nextInt();
           while(n>0)
           {
               n--;
               int a,b;
               a=sc.nextInt();
               b=sc.nextInt();
               if(x==a || y==b)
                   System.out.println("divisa");
               else if(a>x && b>y)
                   System.out.println("NE");
               else if(a<x && b<y)
                   System.out.println("SO");
               else if(a<x && b>y)
                   System.out.println("NO");
               else
                   System.out.println("SE");
               
           }
       }
    }
}