
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SolverX
 */
public class Uva579 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            String s = sc.next();
            StringTokenizer token = new StringTokenizer(s,":");
            int hours=Integer.parseInt(token.nextToken());
            int minutes=Integer.parseInt(token.nextToken());
            if(hours ==0 && minutes ==0)
                break;
            float degree = (((hours*60.00f)+minutes)/2.00f)-(6.00f*minutes);
            if(degree<0)
                degree*=-1;
            if(degree>180)
                degree=360-degree;
            System.out.printf("%.3f",degree);
            System.out.println();
        }
    }
    
}
