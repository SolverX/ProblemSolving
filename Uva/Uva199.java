
import java.util.HashMap;
import java.util.Map;
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
public class Uva199 {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = 0;
        while (sc.hasNextInt()) {
            if(T!=0)
                System.out.println("");
            T++;
            int N = sc.nextInt();
            String groupMember[] = new String[N];
            Map benefit = new HashMap();
            for (int i = 0; i < N; i++) {
                groupMember[i] = sc.next();
            }
            for (int i = 0; i < N; i++) {
                String member = sc.next();
                int amount = sc.nextInt();
                int numberOfGiftsGiven = sc.nextInt();
                int eachPersonAmount = numberOfGiftsGiven >0 ?amount / numberOfGiftsGiven:0;
                int spent = (eachPersonAmount*numberOfGiftsGiven);
                int remains = amount - spent;
                if (benefit.containsKey(member)) {
                    int existingAmount = (Integer) benefit.get(member);
                    benefit.put(member, existingAmount  - spent);
                } else {
                    benefit.put(member, -spent);
                }
                for (int j = 0; j < numberOfGiftsGiven; j++) {
                    String person = sc.next();
                    if (benefit.containsKey(person)) {
                        int existingAmount = (Integer) benefit.get(person);
                        benefit.put(person, existingAmount + eachPersonAmount);
                    } else {
                        benefit.put(person, eachPersonAmount);
                    }
                }
            }
            
            for(int i=0;i<N;i++)
            {
                System.out.println(groupMember[i]+" "+benefit.get(groupMember[i]));
            }

        }

    }

}
