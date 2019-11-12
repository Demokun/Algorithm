import javax.swing.text.html.HTMLDocument;
import java.util.*;
public class Question29 {
    private ArrayList<Integer> Question29(int[][] matrix){
        if(matrix.length == 0){
            return null;
        }
        if(matrix[0].length == 0){
            return null;
        }
        int columns = matrix[0].length; //列
        int rows = matrix.length; //行
        int start = 0;
        int startX = start;
        int startY = start;
        int endX = rows - 1;
        int endY = columns - 1;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(rows > start * 2 && columns > start * 2){
            startX = start;
            startY = start;
            endX = rows - 1 - start;
            endY = columns - 1 -start;
            while(startY <= endY && startX <= endX){
                result.add(matrix[startX][startY]);
                startY ++;
            }
            while(startX + 1  <= endX && rows > start){
                result.add(matrix[startX + 1][startY - 1]);
                startX ++;
            }
            while(startY - 2 >= start && columns > start && rows > start) {
                result.add(matrix[startX][startY - 2]);
                startY --;
            }
            while(startX - 1 >= start  +1 && start + 2 < rows && start < columns){
                result.add(matrix[startX - 1][startY - 1]);
                startX --;
            }
            start ++;

        }
        return result;
    }
    public static void main(String[] args){
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        Question29 q = new Question29();
        ArrayList<Integer> result = new ArrayList<Integer>();
        result = q.Question29(input);
        for(int element: result){
            System.out.println(element);
        }
    }
}
