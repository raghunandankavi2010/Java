/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raghu.test;

/**
 *
 * @author Raghu
 */
public class Palindrome {
    
    private static String testInput="madam";
    public static void main(String[] args)
    {
        System.out.println(palindrome("madama"));
    }
    
    public static boolean palindrome(String input)
    {
        String reverse = "";
        if(input.length()> testInput.length() && input.length()< testInput.length())
        {
            return false;
        }
        for(int i=input.length()-1;i>=0;i--)
        {
            reverse= reverse+input.charAt(i);
        }
        
       if(reverse.equals(input))
       {
           return true;
       }
       else
       {
           return false;
       }
        
    }
}

