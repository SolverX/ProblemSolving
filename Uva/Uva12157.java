
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
public class Uva12157 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        int testCase = 0;
        while(T>0)
        {
            T--;
            int N=sc.nextInt();
            testCase++;
            long mile = 0 ,juice=0;
            while(N>0)
            {
                N--;
                int minutes = sc.nextInt();
                minutes++;
                mile += (minutes/30)*10 + ((minutes%30)!=0?1:0)*10;
                juice += (minutes/60)*15 + ((minutes%60)!=0?1:0)*15;
            }
            System.out.print("Case "+testCase+":");
            if(mile<=juice)
                System.out.print(" Mile");
            if(juice<=mile)
                System.out.print(" Juice");
            System.out.println(" "+Math.min(mile, juice));
        }
    }
    
}
