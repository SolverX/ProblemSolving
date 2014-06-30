
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int testCase = 0;
        while (T > 0) {
            T--;
            testCase++;
            HashMap websites = new HashMap();
            HashMap input =new HashMap();
            websites.clear();
            input.clear();
            int maxVal = 0;
            for (int i = 0; i < 10; i++) {
                String s = sc.next();
                int val = sc.nextInt();
                if (websites.containsKey(s)) {
                    //int newVal = (Integer) (websites.get(s)) + val;
                    if(val>(Integer)websites.get(s))
                        websites.put(s, val);
                    maxVal = Math.max(maxVal, val);
                } else {
                    input.put(i,s);
                    websites.put(s, val);
                    maxVal = Math.max(maxVal, val);
                }
            }
            System.out.println("Case #"+testCase+":");
            for (Object key:input.keySet()) {
                if((Integer) websites.get(input.get(key)) == maxVal)
                    System.out.println(input.get(key));
            }

        }
    }

}
