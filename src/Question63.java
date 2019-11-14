import java.util.*;
public class Question63 {
    public int Question63(int[] array){
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < array.length;i ++){
            if(array[i] < min){
                min = array[i];
            }
            if(array[i] - min > max){
                max = array[i] - min;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] array = {2,1,3,5,8,9};
        Question63 q = new Question63();
        System.out.println(q.Question63(array));
    }
}
