import java.util.*;
public class Question53 {
    public int Question53(int[] array,int k){
        Question53 q = new Question53();
        int first = q.getFirst(array,k);
        int last = q.getLast(array,k);
        return last - first + 1;
    }
    public int binarySearch(int[] array,int k){
        int start = 0;
        int end = array.length;
        int mid = (start + end) / 2;
        while(start < end){
            mid = (start + end) / 2;
            System.out.println(mid);
            if(k < array[mid]){
                end = mid - 1;
            }
            if(k > array[mid]){
                start = mid + 1;
            }
            if(k == array[mid]){
                break;
            }
        }

        return mid;
    }
    public int getFirst(int[] array,int k){
        Question53 q = new Question53();
        int index = q.binarySearch(array,k);
        System.out.println(index);
            while(index >= 0 && array[index] == k){
                index --;
            }
            return index + 1;

    }
    public int getLast(int[] array,int k){
        Question53 q = new Question53();
        int index = q.binarySearch(array,k);
            while(index <= array.length - 1 && array[index] == k){
                index ++;
            }
            return index - 1;
    }
    public static void main(String[] args){
        Question53 q = new Question53();
        int[] array = {1,2,3,3,3,3,3,5,6};
        System.out.println(q.Question53(array,8));
    }



}
