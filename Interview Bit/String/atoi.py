def atoi(self, A):
	    A=A.strip()
	    if not A:
	        return 0
	    Negative=False
	    out=0
	    if A[0]=="-":
	        Negative=True
	    elif A[0]=="+":
	        Negative=False
	        
	    elif not A[0].isnumeric():
	        return 0
	    else:
	        out=ord(A[0]-ord["0"])
	    for i in range(1,len(A)):
	       if A[i].isnumeric():
	           out=out*10+ord(A[i]-ord["0"])
	           if not Negative and out>=2147483647:
	               return 2147483647
	           if  Negative and out>=2147483647:
	               return -2147483647
	       else:
	           break
	    if not Negative:
	       return out
	    else:
	       return -out
	    
