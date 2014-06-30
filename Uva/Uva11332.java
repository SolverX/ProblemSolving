
import java.math.BigInteger;
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
public class Uva11332 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextBigInteger())
        {
            BigInteger big = sc.nextBigInteger();
            if(big.equals(BigInteger.ZERO))
                break;
            BigInteger result = big.mod(BigInteger.valueOf(9));
            if(result.equals(BigInteger.ZERO))
                System.out.println(9);
            else
                System.out.println(result);
        }
    }
    
}
