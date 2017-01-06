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
import java.util.Arrays;

/**
 * * Java program - String Anagram Example. * This program checks if two Strings
 * are anagrams or not
 *
 *
 * @author Javin Paul
 */
public class AnagramCheck {

   public static void main(String[] args)
   {
      boolean check = iAnagram("posts","stops");
      if(check)
      {
          System.out.println("Anagram");
      }
   }
    /* * One way to find if two Strings are anagram in Java. This method *
    assumes both arguments are not null and in lowercase. * 
    * @return true, if both String are anagram */
    public static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

    /* * Another way to check if two Strings are anagram or not in Java * 
    This method assumes that both word and anagram are not null and lowercase * 
    @return true, if both Strings are anagram. */
    public static boolean iAnagram(String word, String anagram) {
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram);
    }

    public static boolean checkAnagram(String first, String second) {
        char[] characters = first.toCharArray();
        StringBuilder sbSecond = new StringBuilder(second);
        for (char ch : characters) {
            int index = sbSecond.indexOf("" + ch);
            if (index != -1) {
                sbSecond.deleteCharAt(index);
            } else {
                return false;
            }
        }
        return sbSecond.length() == 0 ? true : false;
    }
}
