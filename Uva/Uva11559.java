
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
public class Uva11559 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int numberOfPeoples = sc.nextInt();
            int totalBudget = sc.nextInt();
            int numberOfHotels = sc.nextInt();
            int numberOfWeeks = sc.nextInt();
            boolean possible = false;
            int minCost = totalBudget;
            for(int i=0;i<numberOfHotels;i++)
            {
                int rent = sc.nextInt();
                    for(int j=0;j<numberOfWeeks;j++)
                    {
                        int numberOfBedsFree =sc.nextInt();
                            if(numberOfBedsFree>=numberOfPeoples)
                            {
                                if(minCost > numberOfPeoples*rent)
                                {
                                    minCost=numberOfPeoples*rent;
                                    possible = true;
                                }
                            }
                    }
            }
            if(possible)
                System.out.println(minCost);
            else
                System.out.println("stay home");
        }
    }
    
}
