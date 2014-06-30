
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
public class Uva10963 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            T--;
            int N=sc.nextInt();
            int diff=0;
            boolean fixed=true;
            for(int i=0;i<N;i++)
            {
                int a,b;
                a= sc.nextInt();
                b= sc.nextInt();
                if(i==0)
                    diff=Math.abs(a-b);
                else
                {
                    if(diff != Math.abs(a-b))
                        fixed=false;
                    diff=Math.abs(a-b);
                }
            }
            if(fixed)
                System.out.println("yes");
            else
                System.out.println("no");
            if(T>0)
                System.out.println();
        }
    }
    
}
