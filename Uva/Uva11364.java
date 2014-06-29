
import java.util.Scanner;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author SolverX
 */
public class Uva11364 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            T--;
            int N=sc.nextInt();
            int min=100,max=0;
            for(int i=0;i<N;i++)
            {
                int temp = sc.nextInt();


                    min=Math.min(min,temp);
                    max=Math.max(max,temp);
                            
            }
            System.out.println((max-min)*2);
        }
    }
    
}
