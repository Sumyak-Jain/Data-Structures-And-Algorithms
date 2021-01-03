/**
Ques:Maximum and minimum of an array

My approach:
# take array size and and elements as input
# sort the array
# i used simple swapping
# print first element(Min)  and last element(max)

**/

import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter Size of the Array");
        n = sc.nextInt();
      // input
        System.out.println("Enter " + n + " integers");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
// sort
        for (int a = 0; a < n; a++) {
            for (int j = a + 1; j < n; j++) {
                int temp = 0;
                if (arr[a] > arr[j]) {
                    temp = arr[a];
                    arr[a] = arr[j];
                    arr[j] = temp;
                }
            }

        }

      //sorted display
        System.out.println("Sorted Array:");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println("");
      // output
        System.out.println("Min number is: "+ arr[0]);
        System.out.println("Max number is: "+ arr[n-1]);
    }
}
