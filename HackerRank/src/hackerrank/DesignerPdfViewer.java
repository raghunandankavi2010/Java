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


/*The first line contains  space-separated integers describing the respective heights of each consecutive lowercase English letter (i.e., ). 
The second line contains a single word, consisting of lowercase English alphabetic letters.


Print a single integer denoting the area of highlighted rectangle when the given word is selected. The unit of measurement for this is square millimeters (), but you must only print the integer.

Sample Input

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc
Sample Output

9*/
public class DesignerPdfViewer {
    
    
      public static void main(String[] args) {
          
          
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for (int h_i = 0; h_i < n; h_i++)
        {
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int lengh = word.length();
        int max = 0;

        for (int i = 0; i < lengh; i++)
        {
            char tempChar = word.charAt(i);
            System.out.println( h[tempChar - 97]);
            max = max < h[tempChar - 97] ? h[tempChar - 97] : max;
            
        }
       
        System.out.println(max * lengh);

      }
}
