import java.util.*;
/*
array1：找出数组中的一个重复的数字
P43
 */
public class Array1 {
    private int array1(int[] a,int n){
        int num = 0;
        boolean flag = false;
        while(!flag){
            int i = 0;
            if(a[i] == i){
                i = i + 1;
            }
            else{
                int m = a[i];
                if(a[i] == a[m]){
                    num = a[i];
                    flag = true;
                }
                else{
                    int tmp = a[i];
                    a[i] = a[m];
                    a[m] = tmp;

                }
            }
        }
        return  num;
     }
     public static void main(String[] args){
        int[] a = {2,3,5,4,3,2,6,7};
        int n = a.length;
        Array1 array1 = new Array1();
        System.out.println(array1.array1(a,n));
     }
}


