
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author SolverX
 */
public class Uva11727 {
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        int x=0;
        //int A[] = new int[3];
        List A = new ArrayList();
        while(T>0)
        {
            A.clear();
            T--;
            x++;
            for(int i=0;i<3;i++)
            {
                A.add(sc.next());
            }
            
            Collections.sort(A);
            System.out.println("Case "+x+": "+A.get(1));
        }
    }
    
}
