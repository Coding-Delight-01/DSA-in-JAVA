package com.arrays;

import java.util.Arrays;

public class MAX {
    public static void main(String[] args) {

        int[] arr = {21,23,44,70};
        System.out.println(maxRange(arr,1,3));
    }
    //imagine that array is not empty
//    static int max(int[] arr) {
//            int maxVal = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>maxVal) {
//                maxVal = arr[i];
//            }
//        }
    // if want to find in the particular range,

    static int maxRange(int[] arr, int start, int end) {
        if (end > start) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>maxVal) {
                maxVal = arr[i];
            }
        }

        return  maxVal;
    }
}

/*
Explaination:
1. we have to find,maximum number in the array
     that's why we create max function,
     in max function we do this following:
     first of all we mention that at the index position 0 -> we denote that max value
     and use the for loop for checking each element in the array is maximum than 0th index or not,
     if any of the element maximum than 0th index element then max element is that element.

2. we have to find maximum number in the particular range in the array,
     first we create an function named as maxRange,
     in the function we mention that array starting index and ending index
     fist we denote that in the range starting index is maxium
     and use the for loop checking in the range start and end is there any element in the range are maximum than starting index or not.
     that's set!

     important :
     edge cases are there, these are,
     if array is empty then mention that
     1.  if(array,length == 0) {
          return -1;
       }
     2. if (end > start) {
          return -1;
        }
     3. if (arr == null) {
          return -1;
        }
 */