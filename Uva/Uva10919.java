
import java.util.HashMap;
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
//public class Uva10919 {
class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k, m;

        while ((k = sc.nextInt())!=0 && k!=0) {
            m = sc.nextInt();
            HashMap course = new HashMap();
            boolean satisfied = true;
            for (int i = 0; i < k; i++) {
                course.put(sc.next(), 1);
            }
            for (int i = 0; i < m; i++) {
                int c = sc.nextInt();
                int r = sc.nextInt();
                int cnt = 0;
                for (int j = 0; j < c; j++) {
                    if (course.containsKey(sc.next())) {
                        cnt++;
                    }
                }

                if (cnt < r) {
                    satisfied = false;
                }
            }
            if (satisfied) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
