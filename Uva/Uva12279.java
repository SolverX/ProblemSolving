
import java.util.Scanner;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author SolverX
 */
public class Uva12279{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N;
        int testCase=0;
        while(sc.hasNextInt())
        {
            N=sc.nextInt();
            if(N==0)
                break;
            int treatGiven=0,esacped=0;
            testCase++;
            for(int i=0;i<N;i++)
            {
                int tmp=sc.nextInt();
                if(tmp>0)
                    esacped++;
                else
                    treatGiven++;
            }
            System.out.println("Case "+testCase+": "+(esacped-treatGiven));
        }
    }
}
