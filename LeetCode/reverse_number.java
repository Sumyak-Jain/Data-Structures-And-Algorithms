class Solution {
    public boolean isPalindrome(int x) {
       String s=String.valueOf(x);
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r=r+s.charAt(i);
        }
        if(s.equals(r))
            return true;
        else
            return false;
}}
