
import java.util.ArrayList;
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
public class Uva12503 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0)
        {
            T--;
            int numberOfInstructions = sc.nextInt();
            ArrayList list=new ArrayList();
            long total=0;
            while(numberOfInstructions>0)
            {
                numberOfInstructions--;
                String s = sc.next();
                if(s.equals("LEFT"))
                {
                    list.add(-1);
                    total-=1;
                }
                else if(s.equals("RIGHT"))
                {
                    list.add(1);
                    total+=1;
                }
                else
                {
                    String temp = sc.next();
                    int step = sc.nextInt();
                    list.add(list.get(step-1));
                    total +=(Integer)(list.get(step-1));
                    
                }
            }
            System.out.println(total);
        }
    }
    
}
