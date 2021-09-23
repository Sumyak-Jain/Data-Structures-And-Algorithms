class Solution {
    public ListNode mergeTwoLists(ListNode A, ListNode B) {
      ListNode one=A;
      ListNode two=B;
      ListNode result=new ListNode(0);
      ListNode s=result;
        
       while(one != null && two != null){
           if(one.val <=  two.val){
               s.next=one;
               one=one.next;
             
           }
           else{
               s.next=two;
               two=two.next;
              
           }
           
           s=s.next;
           
       }
        
        
        while(one!=null){
             s.next=one;
            one=one.next;
            s=s.next;
          
        }
         while(two != null){
             s.next=two;
             two=two.next;
             s=s.next;
        }
        
        return result.next;
    }
}
