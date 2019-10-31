import java.util.*;
public class Test {
    public static void main(String[] args){
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
        System.out.println(b[0]);
    }
}
