
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
public class Uva621 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            T--;
            String s=sc.next();
            if(s.equals("78") ||s.equals("1") || s.equals("4"))
                System.out.println("+");
            else if(s.endsWith("35"))
                System.out.println("-");
            else if(s.startsWith("9") && s.endsWith("4"))
                System.out.println("*");
            else if(s.startsWith("190"))
                System.out.println("?");
        }
        
    }
    
}
