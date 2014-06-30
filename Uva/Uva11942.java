
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SolverX
 */
public class Uva11942 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        System.out.println("Lumberjacks:");
        while(T>0)
        {
            T--;
            String line = sc.nextLine();
            StringTokenizer tokens = new StringTokenizer(line," ");
            boolean isIncreasingOrder = true;
            boolean isDecreasingOrder = true;
            int  previousValue = 0;
            int present = 0;
            
            while(tokens.hasMoreTokens())
            {
                String valString = tokens.nextToken();
                int val = Integer.valueOf(valString);
                if(present==0)
                {
                    previousValue = val;
                    present++;
                }
                else
                {
                    if(isIncreasingOrder)
                    {
                        if(previousValue>=val)
                            isIncreasingOrder = false;
                    }
                    
                    if(isDecreasingOrder)
                    {
                        if(previousValue<=val)
                            isDecreasingOrder = false;
                    }
                }
                previousValue= val;
            }
            if(isIncreasingOrder || isDecreasingOrder)
                System.out.println("Ordered");
            else
                System.out.println("Unordered");
        }
    }
    
}
