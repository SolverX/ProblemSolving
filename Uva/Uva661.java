
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
public class Uva661 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, m, c,testCase = 0;
        while (true) {
            n = sc.nextInt();
            m = sc.nextInt();
            c = sc.nextInt();
            testCase++;
            if (n == 0 && m == 0 && c == 0) {
                break;
            }
            int fuse[] = new int[n+5];
            int amphere = 0,maxAmphere = 0;
            boolean state[] = new boolean[n+5];
            boolean blown = false;
            for(int i=0;i<n;i++)
            {
                fuse[i] = sc.nextInt();
            }
            
            for(int i=0;i<m;i++)
            {
                int bulb = sc.nextInt();
                bulb--;
                if(state[bulb])
                {
                    state[bulb] = false;
                    amphere -= fuse[bulb];
                }
                else
                {
                    state[bulb] = true;
                    amphere += fuse[bulb];
                    maxAmphere = Math.max(amphere,maxAmphere);
                    if(amphere>c)
                        blown = true;
                }
            }
            System.out.println("Sequence "+testCase);
            if(!blown)
            {
                System.out.println("Fuse was not blown.");
                System.out.println("Maximal power consumption was "+maxAmphere+" amperes.");
            }
            else
            {
                System.out.println("Fuse was blown.");
            }
            System.out.println();
        }
    }

}
