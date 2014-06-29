
import java.util.*;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author SolverX
 */


public class Uva272{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        boolean quote=false;
        while(sc.hasNextLine())
        {
            String str = sc.nextLine();
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='\"')
                {
                    if(quote)
                        System.out.print("''");
                    else
                        System.out.print("``");
                    quote=!quote;
                }
                else
                {
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
            
        }
    }
}