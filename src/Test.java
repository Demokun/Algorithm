import java.util.*;
public class Test {
    public boolean Find(int target, int [][] array) {
        int rows = array.length;
        int col = array[0].length;
        int startRow = rows - 1;
        int startCol = 0;
        while(startRow >= 0 && startCol <= col - 1){
            System.out.println(startRow + "-----------" + startCol);
            if(array[startRow][startCol] > target){
                startRow --;
            }
            else if(array[startRow][startCol] < target){
                startCol ++;
            }
            else if(array[startRow][startCol] == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int target  = 7;
        int[][] array = {{1,2,3,4},{5,6,7,8}};
        Test t = new Test();
        t.Find(target,array);
        //空串和null
        /*
        String[] a = new String[10];
        System.out.println(Arrays.toString(a));
        System.out.println(a.length);
        System.out.println(a[0]);
        String[] b = new String[10];
        for(String element : b){
            element = "";
        }
        System.out.println(Arrays.toString(b));
        System.out.println(b.length);
        System.out.println(b[0]);*/
        //二维数组的length
        /*
        int[][] a = {{2,3,4},{4,5,6}};
        System.out.println(a.length);*/
        /*
        String s = "We are happy";
        int[] array_s = s.codePoints().toArray();
        System.out.println(array_s[2]);*/
        /*
        int i = 22;
        int j = 4;
        Test t = new Test();
        System.out.println(t.numSum(i));
        System.out.println(t.numSum(j));

    }
    private int numSum(int i) {
        int sum = 0;
        do{
            sum += i%10;
        }while((i = i/10) > 0);
        return sum;

    }*/
    }


}
