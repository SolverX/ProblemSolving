
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
public class Uva11799 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        int testCase = 0;
        while(T>0)
        {
            T--;
            testCase++;
            int N= sc.nextInt();
            int max=0;
            while(N>0)
            {
                N--;
                int temp = sc.nextInt();
                if(temp>max)
                    max=temp;
            }
            System.out.println("Case "+testCase+": "+max);
        }
    }
    
}
