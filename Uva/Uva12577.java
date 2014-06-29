
import java.util.Scanner;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author SolverX
 */
public class Uva12577{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int testCase = 0;
        while(sc.hasNext())
        {
            testCase++;
            String s = sc.next();
            if(s.equals("*"))
                break;
            System.out.print("Case "+testCase+": Hajj-e-");
            if(s.equals("Hajj"))
                System.out.println("Akbar");
            else
                System.out.println("Asghar");
        }
    }
    
}
