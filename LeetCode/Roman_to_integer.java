//Roman Number to Integer
class RomanToNumber {
    
    public int romanToDecimal(String str) {
        
        HashMap<Character, Integer> values = new HashMap<Character, Integer>();
        values.put('I',1);
    	values.put('V',5);
    	values.put('X',10);
    	values.put('L',50);
    	values.put('C',100);
    	values.put('D',500);
    	values.put('M',1000);
    	Integer value=0;
    	char prev='M';
    	for(char c:str.toCharArray()) {
    			if(values.get(c)>values.get(prev))
    				value=value-2*values.get(prev);
    			value+=values.get(c);
    			prev=c;
    	}
		return value;
}
}
