public class Solution {
    public long upperHeightSum(int m,ArrayList<Integer> A ){
        long sum=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>m)
            sum+=A.get(i)-m;
        }
        return sum;
    }
    public int solve(ArrayList<Integer> A, int B) {
        int low=0;
        int n=A.size();
        int high=0;
        int ans=0;
        for(int i=0;i<n;i++){
            high=Math.max(high,A.get(i));// calulating max height of tree
        }
        while(low<=high){              // binary search starts here
            int mid=(low+high)/2;
            if(upperHeightSum(mid,A)>=(long)B){//if sum of tree above height mid is more than B
                ans=Math.max(ans,mid);  //update ans 
                low=mid+1;              // try to increase the height
            }
            else{                       // upper height is lesser than B
                high = mid-1;           // so need to go down
            }
            
        }
        return ans;                     // return max possible height 
    }
}
