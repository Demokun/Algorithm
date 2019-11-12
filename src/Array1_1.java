/*
Array1_1:在不改变数组值且不使用辅助数组的条件下，查找数组中的重复元素
P43
 */

import java.util.*;
public class Array1_1 {
    private int array1_1(int[] a,int n ){
        int start = 1;
        int end = n;
        int mid_num = (n - 1)/2;
        while(start <= end){
            int counter = count(a,n,start,mid_num);
            if(end == start){
                if(counter > 1){
                    return a[start];
                }
                else {
                    break;
                }
            }
            if(counter <= mid_num - start + 1 ){
                start = mid_num + 1;
            }
            else{
                end = end - 1;
            }

        }
        return -1;
    }
    private int count(int[] a,int length,int start,int end){
        int counter = 0;
        for(int i = 0;i < length;i++){
            if((a[i] >= start)&&(a[i] <= end)){
                counter ++;
            }
        }
        return counter;
    }
    public static void main(String[] args){
        int[] a = {2,3,5,4,3,2,6,7};
        int n = a.length;
        Array1_1 array = new Array1_1();
        System.out.println(array.array1_1(a,n));
    }


}
