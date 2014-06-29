
import java.util.Scanner;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
/**
 *
 * @author SolverX
 */
public class Uva12372 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int testCase = 0;
        while (T > 0) {
            T--;
            int L, W, H;
            L = sc.nextInt();
            W = sc.nextInt();
            H = sc.nextInt();
            testCase++;
            System.out.print("Case " + testCase + ": ");

            if (L <= 20 && W <= 20 && H <= 20) {
                System.out.println("good");
            } else {
                System.out.println("bad");
            }

        }
    }

}
