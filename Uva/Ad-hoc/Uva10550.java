
import java.util.Scanner;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author SolverX
 */
public class Uva10550 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        while(true)
        {
            a=sc.nextInt();b=sc.nextInt();c=sc.nextInt();d=sc.nextInt();
            if(a==0 && b==0 && c==0 && d==0)
                break;
            int sum = 1080;
            int step1 = (a-b>0?a-b:a-b+40)*9;
            int step2 = (c-b>0?c-b:c-b+40)*9;
            int step3 = (c-d>0?c-d:c-d+40)*9;
            System.out.println(sum+step1+step2+step3);
            
            
        }
    }
    
}
