
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
public class Uva12468 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int from,to;
        while(true)
        {
            from = sc.nextInt();
            to= sc.nextInt();
            if(from==-1 && to==-1)
                break;
            int a = Math.min(from, to);
            int b = Math.max(from, to);
            System.out.println(Math.min(b-a, (a+100-b)));
        }
    }
    
}
