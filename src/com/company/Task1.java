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

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 5;
        int k = 2;
        int arr[] = {5, 6, 1, 2, 6};
        int temp ;



        for(int i = 0; i < arr.length - 1; i++) {
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}

