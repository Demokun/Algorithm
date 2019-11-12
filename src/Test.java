import java.util.*;
public class Test {
    public static void main(String[] args) {
        String str = "helloword";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(0) - 'a');

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
