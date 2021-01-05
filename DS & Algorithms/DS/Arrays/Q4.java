/**
Ques: Move all negative numbers to beginning and positive to end with constant extra space
My approach:
# check wheather the element is -ve or not
# if yes then swap it with next element

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
int j=0;
        for (int a = 0; a < n; a++) {

                if (arr[a] < 0) {
                    int temp = arr[a];
                    arr[a] = arr[j];
                    arr[j] = temp;
                    j++;

            }

        }
        System.out.println("Sorted Array:");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }


    }
    }


