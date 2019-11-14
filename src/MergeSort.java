import java.util.*;
public class MergeSort {
    public static void main(String[] args){
        int[] input = {9,8,7,6,5,4,3,2,1};
        MergeSort ms = new MergeSort();
        ms.sort(input);
        for (int e:input
             ) {
            System.out.println(e);

        }
    }
    public void sort(int[] input){
        int[] tmp = new int[input.length];
        sort(input,0,input.length - 1,tmp);
    }
    public  void sort(int[] input,int left,int right,int[] tmp){
        int mid = 0;
        if(left < right){
            mid = (right + left)/2;
            sort(input,left,mid,tmp);
            sort(input,mid + 1,right,tmp);
            MergeSort ms = new MergeSort();
            ms.merge(input,left,mid,right,tmp);
        }

    }
    public void merge(int[] input,int left,int mid,int right,int[] tmp){
        int lstart = left;
        int rstart = mid + 1;
        int temp = 0;
        while(lstart <= mid && rstart <= right){
            if(input[lstart] <= input[rstart]){
                tmp[temp ++] = input[lstart ++];
            }
            else{
                tmp[temp ++] = input[rstart ++];
            }
        }
        while(lstart <= mid){
            tmp[temp ++] = input[lstart ++];
        }
        while(rstart <= right){
            tmp[temp ++] = input[rstart ++];
        }
        temp = 0;
        while(left <= right){
            input[left ++] = tmp[temp ++];
        }
    }
}
