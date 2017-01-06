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
public class StringPermutations {


    public static void main(String args[]) {
        permutation("","123");
    }

    /* * A method exposed to client to calculate permutation of String in Java. */
    public static void permutation(String input) {
        System.out.println("Input "+input );
        permutation("", input);
    }

    /* * Recursive method which actually prints all permutations * 
  of given String, but since we are passing an empty String *
  as current permutation to start with, * 
  I have made this method private and didn't exposed it to client. */
    private static void permutation(String perm, String word) {
        
        //System.out.println("Outside loop perm " + perm );
        System.out.println("Outside loop word " + word );
        if (word.isEmpty()) {
             System.out.println("Hello"+word.length());
          
            //System.err.println(perm + word);
         
             
        } else {
            /* on the first iteration i=0;
          perm = ""
          word.charAt(i)=1;
          word.substring(0,1)= 2;
          word.substring(1+1,word.legth) =3;
          permutation = ""+1,2+3;
            perm=1
            word =23;
            ////////
            Next -2nd
            permutation (1,23);
            perm =1 ,word =23
            permutation(12,3);
            perm =12;
            word =3
            //////
            Next 3rd
            perm = 123
            word="";
            
          
             */
            for (int i = 0; i < word.length(); i++) {
               
                //System.out.println(" perm initally " + perm );
                System.out.println(" word initially " + word +" Length "+word.length());
                //System.out.println("When i = " + i + "perm = " + perm + word.charAt(i));
                //System.out.println("word = " + word.substring(0, i) + word.substring(i + 1, word.length()));
                permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
                System.out.println("Inside loop word " + word );
            }
        }
    }
}
