public class insertion_sort {
    void sort(int arr[]){
        int n=arr.length;//size of array i.e no. of objects
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){//moving the elements ahead of key from 0 to i-1
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    void print(int arr[]){//print method to print sorted array
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
    //main 
    int arr[]={2,5,3,12,43,1};
    insertion_sort obj=new insertion_sort();
    obj.sort(arr);
        System.out.println("sorted array is:");
    obj.print(arr);
    
    }
}

