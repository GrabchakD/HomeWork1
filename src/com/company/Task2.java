/*
Given an unsorted array of positive integers.
The array divided into monotone parts in which some elements replaced by negative values.
Find missing positive integers in the array.
Negative elements can be placed only inside a monotone part.
Negative elements cannot be in neighboring cells.


* monotone part - a sequence where each next number greater(less) than previous.
* e.g. 4 5 6 7 8 is the monotone part, but 5 3 1 6 7 is not monotone.

Input

{array_length}
{array_values}

Output

{restored array}

Example
Input
8
1 2 -1 4 7 6 -2 4

Output
1 2 3 4 7 6 5 4
*/

package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = (arr[i - 1] + arr[i + 1]) / 2;
            }
        }
    }
}