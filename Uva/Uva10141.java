
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
public class Uva10141 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, P;
        int testCase = 0;
        while (true) {

            N = sc.nextInt();
            P = sc.nextInt();
            if (N == 0 && P == 0) {
                break;
            }
            String acceptedComapany = "";
            Double costMet = 0.00;
            int requirementsMet = 0;
            if (testCase > 0) {
                System.out.println();
            }
            sc.next();
            for (int i = 0; i < N; i++) {
                sc.nextLine();
            }
            for (int i = 0; i < P; i++) {
                String companyName = sc.nextLine();
                //System.out.println(companyName);
                Double cost = sc.nextDouble();
                int compliance = sc.nextInt();
                sc.next();
                for (int j = 0; j < compliance; j++) {
                    sc.nextLine();
                }
                if (i == 0) {
                    acceptedComapany = companyName;
                    costMet = cost;
                    requirementsMet = compliance;
                } else {
                    if (compliance > requirementsMet) {

                        acceptedComapany = companyName;
                        costMet = cost;
                        requirementsMet = compliance;

                    } else if (compliance == requirementsMet) {
                        if (cost < costMet) {
                            acceptedComapany = companyName;
                            costMet = cost;
                            requirementsMet = compliance;
                        }
                    }
                }
            }
            testCase++;
            System.out.println("RFP #" + testCase);
            System.out.println(acceptedComapany);
        }
    }
}
