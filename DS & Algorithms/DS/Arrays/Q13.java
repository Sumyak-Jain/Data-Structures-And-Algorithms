//factorial

class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
      ArrayList<Integer> list = new ArrayList<Integer>();
        Integer n=1;
        int index=0;
        list.add(1);
        
        for(int i=1;i<=N;i++){
            list.add(n=n*i);
            list.remove(index);

        }
