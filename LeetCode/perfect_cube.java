
package collection;
import java.util.*;
public class test{

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int [a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int count=0;
        for(int i=0;i<arr.length;i++){
            int cube_root;
            cube_root = (int)Math.round(Math.cbrt(arr[i]));
            if (cube_root * cube_root * cube_root == arr[i]) {
                count++;

            }

        }
        System.out.print(count);
    }
}
