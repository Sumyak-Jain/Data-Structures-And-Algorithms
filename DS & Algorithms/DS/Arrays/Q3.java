/**
Ques: Xth smallest element
Given an array arr[] and a number x where x is smaller than the size of the array, the task is to find the Kth smallest element in the given array.
It is given that all array elements are distinct.

My approach:
# sort the array
# return x-1 element of the sorted array


Example:
Input:
6
7 10 4 3 20 15
3

Output:
7


**/

import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter Size of the Array");
        n = sc.nextInt();
        System.out.println("Enter " + n + " integers");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int a = 0; a < n; a++) {
            for (int j = a + 1; j < n; j++) {
                if (arr[a] > arr[j]) {
                    int temp = arr[a];
                    arr[a] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Sorted Array:");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        int x;
        System.out.println(" ");
        System.out.println("Enter a Xth number to find Xth smallest number");
        x = sc.nextInt();
        System.out.println("number is : " + arr[x - 1]);

    }
    }


