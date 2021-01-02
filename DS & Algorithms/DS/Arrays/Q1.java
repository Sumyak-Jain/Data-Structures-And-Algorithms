/**
Ques 1: Write a program to reverse an array

My approch: 
# initialize another array and a end variable with end index of the first array
# start a loop from 0 till size of the array
# store the value of end possition of first array to the first possition of second array 
# end--
**/
import java.util.Scanner;
public class array1 {
    public static void main( String[] args) {
Scanner sc= new Scanner(System.in);
int n;
//input
System.out.println("Enter Size of the Array");
n=sc.nextInt();
System.out.println("Enter "+n+" integers");
int arr[]=new int[n]; //first array
for(int i=0; i<n;i++){
    arr[i]=sc.nextInt();
}

int arr1[]=new int[n]; //second array
        int end=n-1; //end var
    for(int a=0;a<n;a++) {
        arr1[a]=arr[end];
        end --;
    }
//output
System.out.println("Reversed Array:");
for(int k=0;k<n;k++){
    System.out.print(arr1[k]+" ");
}
    }
}

