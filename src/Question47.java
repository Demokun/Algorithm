import java.util.*;
public class Question47 {
    public int Question47(int[][] input,int rows,int cols){
        int[][] maxValue = new int[rows][cols];
        for(int i = 0;i < rows;i ++){
            for(int j = 0;j < cols;j ++){
                maxValue[i][j] = 0;
            }
        }
        for(int x = 0;x < rows;x ++){
            for(int y = 0;y < cols;y ++){
                int left = 0;
                int up = 0;
                if(x > 0){
                    up = maxValue[x - 1][y];
                }
                if(y > 0){
                    left = maxValue[x][y - 1];
                }
                System.out.println(input[x][y]);
                maxValue[x][y] = (left > up ? left:up) + input[x][y];
                System.out.println("maxValue[" + x + "][" + y + "]" + " = " + maxValue[x][y]);
            }
        }
        int result = maxValue[rows - 1][cols - 1];
        return result;
    }
    public static void main(String[] args){
        int[][] input = {{1,2,3},{6,5,4},{3,5,1}};
        int rows = input.length;
        int cols = input[0].length;
        Question47 q = new Question47();
        System.out.println(q.Question47(input,rows,cols));
    }

}

