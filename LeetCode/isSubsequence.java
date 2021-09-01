class Solution {
public boolean isSubsequence(String s, String t) {
int i=0,j=0;
int count=0;
while(i<t.length()&&j<s.length())
{
if(s.charAt(j)==t.charAt(i))
{
i++;
j++;
count++;
}
else
i++;
}
if(count==s.length())
return true;
else
return false;
}
}
