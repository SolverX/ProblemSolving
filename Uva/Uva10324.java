
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
public class Uva10324 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCase = 0;
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            char s[] = sc.next().toCharArray();
            int Q = sc.nextInt();
            testCase++;
            sb.append(("Case " + testCase + ":\n"));
            while (Q > 0) {
                Q--;
                int a, b;
                a = sc.nextInt();
                b = sc.nextInt();
                if (b < a) {
                    int temp = a;
                    a = b;
                    b = temp;
                }
                boolean isValid = true;
                for (; a < b; a++) {
                    if (s[a] != s[a + 1]) {
                        isValid = false;
                        break;
                    }
                }
                if (!isValid) {
                    sb.append("No\n");
                } else {
                    sb.append("Yes\n");
                }
            }
        }
        System.out.print(sb);
    }

}
