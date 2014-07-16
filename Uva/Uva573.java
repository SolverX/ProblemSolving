
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
public class Uva573 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int H, U, D, F;
        while (true) {
            H = sc.nextInt();
            if (H == 0) {
                break;
            }
            U = sc.nextInt();
            D = sc.nextInt();
            F = sc.nextInt();
            F = U * F;
            U *= 100;
            D *= 100;
            H *= 100;
            int snailPosition = 0;
            int daysCount = 0;
            boolean reached = false;

            while (true) {
                daysCount++;
                snailPosition += U;
                if (snailPosition > H) {
                    reached = true;
                    break;
                }
                snailPosition -= D;

                U -= F;
                if(U<0)
                    U=0;
                if (snailPosition < 0) {
                    break;
                }

            }

            if (reached) {
                System.out.print("success");
            } else {
                System.out.print("failure");
            }
            System.out.println(" on day " + daysCount);

        }
    }

}
