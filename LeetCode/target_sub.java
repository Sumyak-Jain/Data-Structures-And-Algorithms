

import java.util.*;
public class solution {
    public static List<Integer> target_sub(List<Integer> numbers,int target){
        List<Integer> result=new ArrayList<Integer>();
        int curr_sum=numbers.get(0),start=0,i;
        for(i=1;i<=numbers.size();i++){
            while(curr_sum>target && start<i-1){
                curr_sum=curr_sum- numbers.get(start);
                start++;

            }

            if(curr_sum==target){
                int p=i-1;
                result.add(start);
                result.add(p);
                return  result;
            }

            if(i<numbers.size()){
                curr_sum=curr_sum+numbers.get(i);
            }


        }
        result.add(-1);
        result.add(-1);
        return result;



    }
    public static void main(String[] args){
        List<Integer> numbers=new ArrayList<Integer>();
        numbers.add(4);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(8);
        int target = 12;
        System.out.println(target_sub(numbers,target));


    }
}
