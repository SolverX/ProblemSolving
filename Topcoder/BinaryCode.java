/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author SolverX
 */
public class BinaryCode {

    public String[] decode(String message)
    {
        return new String[]{getResult(message,"0"),getResult(message,"1")};
    }
    private String getResult(String input,String result)
    {
       int len=input.length();
       for(int i=0;i<len-1;i++)
       {
           int encodedDigit = Character.getNumericValue(input.charAt(i));
           int decodedDigit = Character.getNumericValue(result.charAt(i));
           if(i>0)
           {
               decodedDigit+= Character.getNumericValue(result.charAt(i-1));
           }
           
           if(encodedDigit==decodedDigit)
           {
               result+=String.valueOf("0");
           }
           else if(encodedDigit==decodedDigit+1)
           {
               result+=String.valueOf("1");
           }
           else
               return "NONE";
           
       }
       int resultAnswer = Character.getNumericValue(result.charAt(len-1));
       int lastInputDigit = Character.getNumericValue(input.charAt(len-1));
       if(len>1)
       {
           resultAnswer+= Character.getNumericValue(result.charAt(len-2));
       }
       if(resultAnswer != lastInputDigit)
           return "NONE";
       return result;
    }
    
  
     public static void main(String args[]) {
        String[] result = new BinaryCode().decode("123210122");
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}