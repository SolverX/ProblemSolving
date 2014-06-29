
import java.util.Scanner;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author SolverX
 */
public class Uva12250 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s ;
        int t=0;
        while(sc.hasNextLine())
        {
            s = sc.nextLine();
            if(s.equals("#"))
                break;
            t++;
            System.out.print("Case "+t+": ");
            if(s.equals("HELLO"))
                System.out.println("ENGLISH");
            else if(s.equals("HOLA"))
                System.out.println("SPANISH");
            else if(s.equals("HALLO"))
                System.out.println("GERMAN");
            else if(s.equals("BONJOUR"))
                System.out.println("FRENCH");
            else if(s.equals("CIAO"))
                System.out.println("ITALIAN");
            else if(s.equals("ZDRAVSTVUJTE"))
                System.out.println("RUSSIAN");
            else
                System.out.println("UNKNOWN");
        }
    }
    
}
