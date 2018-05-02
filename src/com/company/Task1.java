/*
Given an integer array. Move first k elements to the array end.

Input

{array length} {k}
{array values}

Output
{rotated array}

Example
Input

5 2
5 6 1 2 6

Output

1 2 6 5 6
*/

package com.company;

public class Task1 {
    public static void main(String[] args) {
        int arr[] = {6, 2, 9, 1, 3, 4, 5};
        int k = 5;
        int length = 7;


            for (int i = 0; i < k; i++) {
                int empty = arr[0];
                int p;

                for (p = 0; p < length - 1; p++) {
                    arr[p] = arr[p + 1];
                }
                arr[p] = empty;
            }


        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}

