 public static void main(String[] args) {
        int dividend = 100;
        int divisor = 3;
        int sign = ((dividend < 0) ^
                (divisor < 0)) ? -1 : 1;

        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);

        int quotient=0;
        while(dividend>=divisor){
            dividend-=divisor;
            quotient++;

        }
        System.out.println(sign*quotient);
    }
