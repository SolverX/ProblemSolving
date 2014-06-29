
import java.util.Scanner;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author SolverX
 */
public class Uva12403 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int amt = 0;
        while(T>0)
        {
            T--;
            String choice = sc.next();
            if(choice.equals("donate"))
            {
                amt+=sc.nextInt();
            }
            else
                System.out.println(amt);
        }
    }
    
}
