
import java.util.*;
import java.math.BigInteger;


public class Demo {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


      //  int result = arr[0];

        /* Number of subsequences is (2**n -1)*/
        int opsize = (int)Math.pow(2, n);

        /* Run from counter 000..1 to 111..1*/
        ArrayList<Integer> list
                = new ArrayList<Integer>(n);
        ArrayList<Integer> list1
                = new ArrayList<Integer>(n);
        //function to find GCD of two numbers

        for (int counter = 1; counter < opsize; counter++)
        {

            for (int j = 0; j < n; j++)
            {
                /* Check if jth bit in the counter is set
                    If set then print jth element from arr[] */

                if (BigInteger.valueOf(counter).testBit(j))
                //    System.out.print(arr[j]+" ");
                list.add(arr[j]);


            }
         //   System.out.print(list);
            int result = list.get(0);
            for(int i=1; i<list.size(); i++){
                result = findGCD(arr[i], result);
            }
           // System.out.print("GCD: "+result);
            list1.add(result);


            list.clear();
         //   System.out.println();
           //
        }
      //  System.out.print(list1);
        long output = list1.stream().distinct().count();
        System.out.print(output);





        

        }
    //function to find GCD of two numbers
    public static int findGCD(int a, int b){
        if(b == 0)
            return a;
        return findGCD(b, a%b);
    }



    }


