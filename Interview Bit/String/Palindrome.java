int Solution::isPalindrome(string A) {
     string s;
    for(int i=0;i<A.size();i++){
        if(A[i]>='A' && A[i]<='Z') A[i]=tolower(A[i]);
        if(A[i]>='a' && A[i]<='z' || A[i]>='0' && A[i]<='9'){
            s.push_back(A[i]);
        }
    }
    
    int start = 0;
    int end = s.size()-1;
    while(start<=end){
        if(s[start]!=s[end]) return false;
        start++;
        end--;
    }
    return true;
}
