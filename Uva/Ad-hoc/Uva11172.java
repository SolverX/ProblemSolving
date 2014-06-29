
import java.io.*;
import java.util.*;


/**
 *
 * @author SolverX
 */

public class Uva11172{
    
    public static void main(String args[]) throws IOException
    {
       Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N>0)
        {
            N--;
            int A,B;
            A = sc.nextInt();
            B = sc.nextInt();
            if(A>B)
                System.out.println(">");
            else if(A==B)
                System.out.println("=");
            else
                System.out.println("<");
        }
    }
}
