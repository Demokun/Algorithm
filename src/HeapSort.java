import java.util.*;
public class HeapSort {
    public static void main(String[] args){
        int[] array = {9,8,7,6,5,4,3,2,1};
        int length = array.length;
        HeapSort h = new HeapSort();
        System.out.println(Arrays.toString(array));
     }
    public static void sort(int []arr){
        HeapSort h = new HeapSort();
        for(int i=arr.length/2-1;i>=0;i--){
            h.HeapSort(arr,i,arr.length);
        }
        for(int j=arr.length-1;j>0;j--){
            h.swap(arr,0,j);//将堆顶元素与末尾元素进行交换
            h.HeapSort(arr,0,j);//重新对堆进行调整
        }
    }

    public void HeapSort(int[] array,int i,int length){
        int tmp = array[i];
        int index = i * 2 + 1;
        for(index = i * 2 + 1;index < length ;index = 2 * index + 1){
            if(index + 1 < length && array[index] < array[index + 1]){
                index ++;
            }
            if(array[index] < tmp){
                array[index] = tmp;
                i = index;
            }
            else{
                break;
            }
        }
        array[i] = tmp;
    }
    public void swap(int[] input,int x,int y){
        int tmp = input[x];
        input[x] = input[y];
        input[y] = tmp;
    }
}
