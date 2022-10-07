package com.arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {

        //we want to swap the index here
        int[] arr = {21,3,4,14,32};
//        swap(arr, 0,1);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    //reverse the array
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<end) {
            //swap
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr ,int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

//explanation:
/*
    first we take a array of any size
    then
    we define swap function and in the swap function we do this following:
    fist we mention a temporary variable as "temp"
    now, this temp variable is assign to the index 1 and next, index1 is assign to the index2
    and finally
    index1 is assign to the temp
    that's the loop we need to create for swaping the indedx in the array.


    for the revesing the array we cheack the first and last value that first value is grateer than last value or not
    if first value is grateer thanlst value then stop there and it's reverse the array!
    and this is known as two pointer method
 */