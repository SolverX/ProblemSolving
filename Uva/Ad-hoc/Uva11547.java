
import java.util.Scanner;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author SolverX
 */
public class Uva11547 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            T--;
            int num = sc.nextInt();
            int total = (((num * 63) + 7492) * 5) - 498;
            total/=10;
            total%=10;
            if(total<0)
                total*=-1;
            System.out.println( total );
        }
    }
    
}
