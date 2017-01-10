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
public class ArrayRotation {

    /*
    Cycle 0: i=0 , n=5 , d=4: a[(0+5-4)%5]==> a[1]=1 first value is stored
    Cycle 1: i=1 , n=5 , d=4: a[(1+5-4)%5]==> a[2]=2 second value is stored
    Cycle 2: i=2 , n=5 , d=4: a[(2+5-4)%5]==> a[3]=3 third value is stored
    Cycle 3: i=3 , n=5 , d=4: a[(3+5-4)%5]==> a[4]=4 fourth value is stored
    Cycle 4: i=4 , n=5 , d=4: a[(4+5-4)%5]==> a[0]=5 fifth value is stored
    Array values: [5,1,2,3,4] //4th rotation
    */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[(i + n - d) % n] = in.nextInt();  //logic 
            System.out.println((i + n - d) % n);
        }
        for (int i = 0; i < n; i++) {

            System.out.print(a[i] + " ");

        }

    }
}
