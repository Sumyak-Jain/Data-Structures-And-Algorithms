import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numSize = scan.nextInt();  //read input N
        int[] element = new int[numSize];  //initialize an array of N elements
        int[] odd = new int[numSize/2];
        int[] even = new int[numSize/2];
        int o=odd.length;
        int e= even.length;
        int[] result = new int[o+e];
        //read N elements from input
        for(int i=0; i<numSize; i++) {
            element[i] = scan.nextInt();
        }

        int j=0;
        int k=0;
        for(int i=0;i<numSize;i++) {
            if(i%2==0) {
                odd[j] = element[i];
                j++;
            }
            else{
                even[k] = element[i];
                k++;
            }
        }

        Arrays.sort(odd);
        Arrays.sort(even);
        System.arraycopy(odd, 0, result, 0, o);
        System.arraycopy(even, 0, result, o,e);
        //System.out.println(Arrays.toString(result));
        String str = Arrays.toString(result);
        String strNew = str.replace(",", "");
        String strNew1=strNew.replace("[","");
        String strNew2=strNew1.replace("]","");
        System.out.println(strNew2);
    }
}
