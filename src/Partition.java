import java.util.*;
public class Partition {
    public int Partition(int[] input,int length,int start,int end){
        if(input == null || length <= 0 || start < 0 || end >= length){
            return 0;
        }
        int small = start - 1;
        Random rd = new Random();
        int rand = rd.nextInt(end - start);
        int index = rand + start;
        System.out.println("rand = " + rand);
        System.out.println("index = " + index);
        System.out.println("end = " + end);
        swap(input,index,end);
        for(index = start;index < end;index ++){
            if(input[index] < input[end]){
                small ++;
                if(index != small){
                    swap(input,index,small);
                }
            }
        }
        small ++;
        System.out.println("small = " + small);
        swap(input,index,small);

        return small;
    }
    public void swap(int[] input,int x,int y){
        int tmp = input[x];
        input[x] = input[y];
        input[y] = tmp;
    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if (input == null || input.length <= 0 || k < 1 || k > input.length) {
            return null;
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        int start = 0;
        int end = input.length - 1;
        int small = Partition(input, input.length, 0, input.length - 1);
        while (small != k - 1) {
            if (small < k - 1) {
                start = small + 1;
                System.out.println("start = "  + start);
                small = Partition(input, input.length, start, end);
            } else {
                end = small - 1;
                small = Partition(input, input.length, start, end);
            }
        }
        if (small == k - 1) {
            for (int i = 0; i <= small; i++) {
                result.add(input[i]);
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] input = {4,5,1,6,2,7,3,8};
        Partition p = new Partition();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result = p.GetLeastNumbers_Solution(input,8);
        for (int e:result
             ) {System.out.println(e);

        }
    }

}
