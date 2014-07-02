
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
class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = "Happy birthday to you Happy birthday to you Happy birthday to Rujia Happy birthday to you";
        
        StringTokenizer strTokenizer = new StringTokenizer(str," ");
        String[] array=new String[17];
        int pos1=0;
        while(strTokenizer.hasMoreTokens())
            array[pos1++] = strTokenizer.nextToken();
        int T = sc.nextInt();
        
        String[] singer = new String[T+1];
        for(int i=0;i<T;i++)
        {
            singer[i] = sc.next();
        }
        
        int wordPos = 0;
        int printed = 0;
        do
        {
            for(int i=0;i<T;i++)
            {
                printed++;
                System.out.println(singer[i]+": "+array[wordPos]);
                wordPos++;
                wordPos%=16;
                if(wordPos==0 && printed>=T)
                    break;
            }
        }while(wordPos!=0);
    }
    
}
