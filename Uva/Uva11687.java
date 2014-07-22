
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
public class Uva11687 {
    private static int findCount(int len)
    {
        if(len==1)
            return 1;
        
        int size = 1+findCount(String.valueOf(len).length());
        return size;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String str = sc. nextLine();
            if(str.equals("END"))
                break;
            int len = str.length();
            int add = 0;
            if(len>1)
                add=1;
            else if(Integer.parseInt(str)!=1)
                add=1;
            System.out.println(findCount(len)+add);
            
        }
        
    }
    
}
