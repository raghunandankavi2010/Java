/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Raghu
 */
public class HackerRank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);  
         
         int count = sc.nextInt();
       
         int sum=0;
         
         for(int i=0;i<count;i++)
         {
             sum = sum +sc.nextInt();
             
         }
         System.out.println(sum);
    }
    
}
