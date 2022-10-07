package com.arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class multidimensional_arrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // 2D array are defined in two brackets

    /*
    1 2 3
    4 5 6
    7 8 9
     */

        //syntax of 2D array:

        int[][] arr = new int[3][3];
        // in the syntax rows are mandatory , column are not!

        //or directly you can write
//        int[][] arr1 = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
        // column is not necessary to mention because column is depending upon size of the row

        /*
        in 2D also continuos memeory allocation.
         */

        // take a INPUT from 2D array:

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        //OUTPUT:
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++)
                System.out.print(arr[row][col] + " ");
            System.out.println();

        // enhance for loop
            /*
            for(int a : arr)  {
            System.out.println(Arrays.tostring(a
            ));
            }
             */
        }
    }
}