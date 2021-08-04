public class Solution {
    public ArrayList<ArrayList<String>> partition(String a){
        ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
        ArrayList<String> temp = new ArrayList<>();
        solve(ans, a, temp);
        return ans;
    }
    public void solve(ArrayList<ArrayList<String>> ans, String a, ArrayList<String> temp){
        if(a.length() == 0){
            ans.add(new ArrayList<String>(temp));
            return;
        }
        for(int i=0; i<a.length(); i++){
            String left = a.substring(0, i+1);
            String right = a.substring(i+1);
            if(isPalindromic(left)){
                temp.add(left);
                solve(ans, right, temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public boolean isPalindromic(String str){
        int i=0; int j=str.length()-1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}
