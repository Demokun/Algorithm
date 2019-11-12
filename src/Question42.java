import java.util.*;
public class Question42 {
    public int Question45(int[] array){
        int max = 0;
        if(array == null || array.length == 0){
            return max;
        }

        int length = array.length;
        boolean flag = true;
        int tmpMax = 0;
        for(int i = 0;i < length;i ++){
            if(tmpMax <= 0){
                tmpMax = array[i];
            }
            else {
                tmpMax = tmpMax + array[i];
            }
            if(max < tmpMax){
                max = tmpMax;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Question42 q = new Question42();
        int[] input = {1,-2,3,10,-4,7,2,-5};
        System.out.println(q.Question45(input));
    }
}
