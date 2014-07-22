
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SolverX
 */
public class Uva11661 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N;
        while(true)
        {
            N = sc.nextInt();
            if(N==0)
                break;
            String str = sc.next();
            boolean zFound = false;
            if(str.contains("Z"))
                zFound = true;
            int recentR=N+N,recentD=N;
            int minDist = N+1;
            for(int i=0;i<N && !zFound && minDist!=1;i++)
            {
                if(str.charAt(i)=='D')
                {
                    recentD = i;
                    minDist = Math.min(minDist , Math.abs(recentD-recentR));
                }
                else if(str.charAt(i)=='R')
                {
                    recentR = i;
                    minDist = Math.min(minDist , Math.abs(recentD-recentR));
                }
                
            }
            if(zFound)
                System.out.println(0);
            else
                System.out.println(minDist);
        }
        
    }
    
}
