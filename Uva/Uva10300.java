
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
public class Uva10300 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int T = sc.nextInt();
            while (T > 0) {
                T--;
                int numberOfFarmers = sc.nextInt();
                long totalAmount = 0;
                for (int i = 0; i < numberOfFarmers; i++) {
                    float formSize, numberOfAnimals;
                    int environmentFriendly;
                    formSize = sc.nextFloat();
                    numberOfAnimals = sc.nextFloat();
                    environmentFriendly = sc.nextInt();
                    totalAmount += (formSize * environmentFriendly);
                }
                System.out.println(totalAmount);
            }
        }
    }

}
