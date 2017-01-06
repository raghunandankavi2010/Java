/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Raghu
 */
public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        ArrayList<Long> list = new ArrayList<Long>(5);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        long max=0;
        long min=0;
    
        
        list.sort((p1, p2) -> p1.compareTo(p2));
        
        ArrayList<Long> sum = new ArrayList<Long>(5);
 
        for(int i =1;i<list.size();i++)
        {
          
           
           max = max + list.get(i);
           min = min + list.get(i-1);        
        }
        
     
        
        System.out.println(min+" "+max);
    }
}
