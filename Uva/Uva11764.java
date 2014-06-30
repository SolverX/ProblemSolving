
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
public class Uva11764 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int testCases = 0;
        while (T > 0) {
            T--;
            int N = sc.nextInt();
            testCases++;
            int lowJumps = 0;
            int highJumps = 0;
            int currentHeight = 0;
            for (int i = 0; i < N; i++) {
                int temp = sc.nextInt();
                if (i != 0) {
                    if (currentHeight < temp) {
                        highJumps++;
                    } else if (currentHeight > temp) {
                        lowJumps++;
                    }

                }
                currentHeight = temp;
            }
            System.out.println("Case "+testCases+": "+highJumps+" "+lowJumps);
        }
    }

}
