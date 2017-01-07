/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Raghu
 */
public class DeleteCharsToMakeAnagram {
    
    /* 
    Problem to find how many characters to delete to make given 2 strings anagram
    posts and stops are anagram. Same characters arranged differntly
    input 
    abc
    cde
    ASCI value of a is 97 b is 98,c is 99, d 100 ,e is 101
              index 0 1 2 3 4 
    initial array = 0 0 0 0 0 ...total 26 . For now consider abcde ie 4
    1st For loop
        For character a =  array[c-'a']++ = array[97-97] ++ = array[0]++ = 0++ = 1   
        For character b =  array[c-'a']++ = array[98-97] ++ = array[1]++ = 0++ = 1           
        For character c =  array[c-'a']++ = array[99-97] ++ = array[2]++ = 0++ = 1  
    2nd For loop
        For character c =  array[c-'a']++ = array[97-97] ++ = array[2]++ = 1-- = 0   
        For character d =  array[c-'a']++ = array[100-97] ++ = array[3]++ = 0-- = -1           
        For character e =  array[c-'a']++ = array[99-97] ++ = array[4]++ = 0-- = -1  
    Final array = = 1 1 0 -1 -1 0 0 0 so for till 26
    Math.abs(1) = 1
    while Math.abc(-1) = -(-1) = 1
    Sum = 1+1+0+1+1+0+..so for till 26 = 4
   
         
    */
   public static int numberNeeded(String first, String second) {
		int[] lettercounts = new int[26];
		for(char c : first.toCharArray()){
			lettercounts[c-'a']++;
                        System.out.println("Plus"+lettercounts[c-'a']);
		}
		for(char c : second.toCharArray()){
			lettercounts[c-'a']--;
                        System.out.println("Minus"+lettercounts[c-'a']);
		}
		int result = 0;
		for(int i : lettercounts){
                    System.out.println("Total"+Math.abs(i));
			result += Math.abs(i);
                        
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}
