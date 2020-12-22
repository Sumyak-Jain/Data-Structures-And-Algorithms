/**In Bubble sort, Each element of the array is compared with its adjacent element.
The algorithm processes the list in passes. A list with n elements requires n-1 passes for sorting. Consider an array A of n elements whose elements are to be sorted by using Bubble sort. The algorithm processes like following.

In Pass 1, A[0] is compared with A[1], A[1] is compared with A[2], A[2] is compared with A[3] and so on. At the end of pass 1, the largest element of the list is placed at the highest index of the list.
In Pass 2, A[0] is compared with A[1], A[1] is compared with A[2] and so on. At the end of Pass 2 the second largest element of the list is placed at the second highest index of the list.
In pass n-1, A[0] is compared with A[1], A[1] is compared with A[2] and so on. At the end of this pass. The smallest element of the list is placed at the first index of the list.
**/
//java program

import java.util.Scanner;
public class bubble_sort {
    public static void main(String[] args) {
           
    Scanner sc =new Scanner(System.in);
    System.out.println("enter 10 digits");
    int a[]= new int[10];
    for( int i=0; i<10; i++){
    a[i]=sc.nextInt();}
    int temp;
    for(int i=0;i<10;i++){
        for(int j=i+1;j<10;j++){
            if(a[i]<a[j]){
                temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
    }
    System.out.println("sorted array");
            for(int i=0;i<10;i++){
                System.out.println(a[i] + " ");
            }
    
}}
