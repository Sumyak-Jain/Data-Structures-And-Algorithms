public class max_deviation_subsequence {

    static int findSubsequence(int M, int K, int[] arr){
        int count=0;
        for (int i = 0; i < (1<<arr.length); i++)
        {
            List<Integer> list=new ArrayList<Integer>();


            for (int j = 0; j < arr.length; j++) {
                if ((i & (1 << j)) > 0)
                    list.add(arr[j]);
            }
            if(list.size()==M){

                Collections.sort(list);
                if(list.get(M-1)-list.get(0)==K){
                    count++;
                }
            }

        }

        return count;
    }
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int M=sc.nextInt();
       int K=sc.nextInt();
       int N=sc.nextInt();
       int arr[]=new int[N];
       for(int i=0;i<N;i++){
           arr[i]=sc.nextInt();
       }

       System.out.println(findSubsequence(M,K,arr));


    }
}
