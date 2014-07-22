
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
public class Uva11586 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        sc.nextLine();
        while (Q > 0) {
            Q--;
            int male = 0, female = 0;
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'M') {
                    male++;
                } else if (s.charAt(i) == 'F') {
                    female++;
                }
            }
            if (male == female && male!=1) {
                System.out.println("LOOP");
            } else {
                System.out.println("NO LOOP");
            }
        }
    }

}
