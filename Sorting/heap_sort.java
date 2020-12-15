
public class heap_sort {
    
    public static void main(String[] args) {
        int arr[]={17,3,5,2,6,7};
        int n=arr.length;
        heap_sort obj=new heap_sort();
        obj.sort(arr);
        System.out.println("sorted array after heap sort is:");
        printArray(arr);
    }
    public void sort(int arr[])
       {
         int n=arr.length;
        for(int i = n/2 -1; i>0; i-- )//build heap
            Heapify(arr,n,i);
        
        for(int i=n-1;i>0;i--)//extract the element from heap
        {
            int swap=arr[0];
            arr[0]=arr[i];
            arr[i]=swap;
            
            Heapify(arr,i,0);
        }
       }    
        void Heapify(int arr[],int n,int i)
        {
            int largest=i;//storing the parent of subtree as the largest elemnet
            int l=2*i+1;//left child of parent
            int r=2*i+2;//right child of parent
        if(l<n && arr[l]>arr[largest])//check the condition and change largest accordingly
            largest=l;
        if(r<n && arr[r]>arr[largest])
            largest=r;
        if(largest != i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            
            Heapify(arr,n,largest);//heapify recursively
        }
        }
        static void printArray(int arr[])
        {
            int n=arr.length;
            for(int i=0;i<n ;i++)
            {
                System.out.println(arr[i]+" ");
                System.out.println();
            }
            
        }   
    }
