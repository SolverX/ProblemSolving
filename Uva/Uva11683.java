
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
public class Uva11683 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A,C;
        while(true)
        {
            A= sc.nextInt();
            if(A==0)
                break;
            C = sc.nextInt();
            int recentElement = 0;
            int cutCount = 0;
            for(int i=0;i<C;i++)
            {
                int n = sc.nextInt();
                if(i==0)
                {
                    cutCount = (A-n);
                }
                else
                {
                    if(recentElement>n)
                        cutCount+=(recentElement-n);
                }
                recentElement = n;
            }
            System.out.println(cutCount);
        }
    }
    
}
