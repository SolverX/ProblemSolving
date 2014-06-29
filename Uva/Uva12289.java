
import java.util.Scanner;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author SolverX
 */
public class Uva12289 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            T--;
            String s = sc.next();
            if(s.length()>3)
                System.out.println(3);
            else
            {
                int cnt=0;
                if(s.charAt(0)=='o')
                    cnt++;
                if(s.charAt(1)=='n')
                    cnt++;
                if(s.charAt(2)=='e')
                    cnt++;
                if(cnt>=2)
                    System.out.println(1);
                else
                    System.out.println(2);
            }
        }
        
    }
    
}
