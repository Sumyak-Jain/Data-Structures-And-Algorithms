

public class recur {
    static int exp(int n){
        if(n==0)
            return 1;
        int ans=2*exp(n-1);
        System.out.println(ans);
        return ans;
    }
    static int check_sorted(int Array1[],int index){
      if(index >= Array1.length){
          return 0;
      }
      if(Array1[index]<Array1[index-1]){
          return 1;
      }

      return check_sorted(Array1,index+1);


    }
    public static void main(String[] args){

        //exp(5);
        int[] Array1 = new int[]{ 1,4,3,5,6 };
        if(check_sorted(Array1,1)==0){
            System.out.println("Sorted");
        }
        else{
            System.out.println("Unsorted");
        }

    }

}
