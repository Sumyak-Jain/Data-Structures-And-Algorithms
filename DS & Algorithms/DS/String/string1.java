// check palindrome

class Solution {
    int isPlaindrome(String S) {
        
        String m="";
        char[] ch = S.toCharArray();
        int n=S.length()-1;
       for(int i=n;i>=0;i--){
            m=m+ch[i];
        }
        boolean ans = S.equals(m);
        if(ans==true){
            return 1;
        }
        else{
        return 0;
        }
    }
};
