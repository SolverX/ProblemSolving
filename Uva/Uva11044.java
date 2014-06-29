
import java.util.Scanner;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author SolverX
 */
public class Uva11044 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            T--;
            int X,Y;
            X = sc.nextInt();
            Y = sc.nextInt();
            X/=3;
            Y/=3;
            System.out.println(X*Y);
        }
    }
    
}
