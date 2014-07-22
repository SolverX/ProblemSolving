
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
public class Uva893 {

    private static int daysInMonth[]={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static boolean isLeapYear(int year)
    {
        if(year%4==0 && (year%400==0 || year%100!=0))
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int numberOfDaysRemaining;
        int day;
        int month;
        int year;
        while(true)
        {
            numberOfDaysRemaining = sc.nextInt();
            day = sc.nextInt();
            month = sc.nextInt();
            year = sc.nextInt();
            if(numberOfDaysRemaining ==0 && day==0 && month==0 && year==0)
                break;
            
            while(numberOfDaysRemaining>0)
            {
                int numberOfDays = daysInMonth[month-1];
                
                if(month==2 && isLeapYear(year))
                    numberOfDays = 29;
                numberOfDaysRemaining =  (day+numberOfDaysRemaining) - numberOfDays;
                
                 if(numberOfDaysRemaining==0)
                        day=numberOfDays;
                 
                else if(numberOfDaysRemaining>0)
                    month++;
                if(month>12)
                    year++;
                month = (month%12 == 0) ? 12:month%12;
                if(numberOfDaysRemaining>0)
                 {
                     day=1;
                     numberOfDaysRemaining--;
                 }
                else if(numberOfDaysRemaining<0)
                {
                    day=(numberOfDays+numberOfDaysRemaining);
                }
                
                //System.out.println(numberOfDaysRemaining);
            }
            System.out.println(day+" "+month+" "+year);
        }
    }
    
}
