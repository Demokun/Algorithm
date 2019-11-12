/*
Array2:在二维矩阵中找指定的整数
P44
 */
public class Array2 {
    private boolean Array2(int[][] a,int n){
        if(a.length == 0){
            return false;
        }
        boolean flag = false;
        int column = a[0].length - 1;
        int row = 0;
        while((row <= a.length)&&(column <= a[0].length)){
            if(a[row][column] == n){
                return true;
            }
            if(a[row][column] > n){
                column = column - 1;
            }
            if(a[row][column] < n){
                row = row + 1 ;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] a = {{1,2,8,9},
                     {2,4,9,12},
                     {4,7,10,13},
                     {6,8,11,15}};
        int n = 7;
        Array2 array = new Array2();
        System.out.println(array.Array2(a,n));
    }

}
