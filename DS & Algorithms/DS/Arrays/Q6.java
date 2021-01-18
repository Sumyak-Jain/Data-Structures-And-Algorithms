/**
Ques:
Given an array, rotate the array by one position in clock-wise direction.
Example:
Input:
N = 5
A[] = {1, 2, 3, 4, 5}
Output:
5 1 2 3 4

Approach: store last element in a variable
shift all elements by by one possition
place last element in first possition

**/
void rotate(int arr[], int n)
{
   int x = arr[n-1], i;
   for (i = n-1; i > 0; i--)
      arr[i] = arr[i-1];
   arr[0] = x;
}

