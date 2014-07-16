
import java.text.DecimalFormat;
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
public class Uva10424 {
    
    private static int getTotal(String str)
    {
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) >='a' && str.charAt(i)<='z')
                sum+=(str.charAt(i)-'a')+1;
        }
        sum = (sum%9==0)?9:sum%9;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            String person1 = sc.nextLine();
            String person2 = sc.nextLine();
            person1 = person1.toLowerCase();
            person2 = person2.toLowerCase();
            float sum1 = getTotal(person1)*1.00f;
            float sum2 = getTotal(person2)*1.00f;
            
            float ratio = (sum1>sum2)? sum2/sum1 : sum1/sum2;
            if(person1.length()!=0 || person2.length()!=0)
            {
                System.out.printf("%.2f",(ratio*100));
                System.out.println(" %");
            }
            else
                System.out.println();
            
        }
    }
    
}
